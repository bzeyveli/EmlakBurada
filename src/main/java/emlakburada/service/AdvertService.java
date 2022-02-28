package emlakburada.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import emlakburada.model.Address;
import emlakburada.model.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.client.BannerClient;
import emlakburada.dto.AdvertRequest;
import emlakburada.dto.response.AdvertResponse;
import emlakburada.model.Advert;
import emlakburada.model.User;
import emlakburada.queue.QueueService;
import emlakburada.repository.AdvertRepository;
import emlakburada.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdvertService  implements AdvertServiceImpl{

	@Autowired
	private AdvertRepository advertRepository;

	@Autowired
	private BannerClient bannerClient;

	@Autowired
	private QueueService queueService;

	@Autowired
	private UserRepository userRepository;

	@Override
	public AdvertResponse create(AdvertRequest advertRequest) {
		Optional<User> foundUser = userRepository.findById(advertRequest.getUserId());

		Advert advert = convertToAdvert(advertRequest, foundUser);

		try {

			if (advert == null) {
				throw new Exception("İlan kaydedilemedi");
			}

			Advert savedAdvert = advertRepository.save(advert);
			// EmailMessage emailMessage = new EmailMessage("cemdrman@gmail.com");
			// queueService.sendMessage(emailMessage);
			// bannerClient.saveBanner();
			return convertToAdvertResponse(savedAdvert);
		} catch (Exception e) {
		e.printStackTrace();	
		}

		return null;

	}

	@Override
	public List<AdvertResponse> findAll() {
		List<AdvertResponse> advertList = new ArrayList<>();
		for (Advert advert : advertRepository.findAll()) {
			advertList.add(convertToAdvertResponse(advert));
		}
		return advertList;
	}

	@Override
	public AdvertResponse update(Integer id, AdvertRequest advertRequest) {
		Advert advert = advertRepository.getById(id);
		advert.setBaslik(advertRequest.getBaslik());
		advert.setFiyat(advertRequest.getFiyat());
		advertRepository.saveAndFlush(advert);
		AdvertResponse advertResponse = convertToAdvertResponse(advert);
		return advertResponse;
	}

	@Override
	public Boolean delete(Integer id) {
		try {
		advertRepository.deleteById(id);
		} catch (Exception e){
			e.printStackTrace();
		}
		return true;
	}

	private Advert convertToAdvert(AdvertRequest request, Optional<User> foundUser) {
		// Advert advert = new Advert(new RealEstate(), new User(), new String[5]);

		Advert advert = null;

		if (foundUser.isPresent()) {
			advert = new Advert();
			advert.setCreatorUser(foundUser.get());
			Constants.advertNo++;

			advert.setAdvertNo(Constants.advertNo);
			advert.setBaslik(request.getBaslik());
			advert.setFiyat(request.getFiyat());
		} 

		return advert;
	}

	public AdvertResponse getAdvertByAdvertId(Integer advertId) {
		Optional<Advert> advert = advertRepository.findById(advertId);
		return convertToAdvertResponse(advert.get());
	}

	private AdvertResponse convertToAdvertResponse(Advert savedAdvert) {
		AdvertResponse response = new AdvertResponse();
		response.setBaslik(savedAdvert.getBaslik());
		response.setFiyat(savedAdvert.getFiyat());
		response.setAdvertNo(savedAdvert.getAdvertNo());
		response.setKullanici(savedAdvert.getCreatorUser());
		return response;
	}
}
