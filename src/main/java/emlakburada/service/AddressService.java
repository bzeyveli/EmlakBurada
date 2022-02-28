package emlakburada.service;

import emlakburada.dto.AddressRequest;
import emlakburada.dto.response.AddressResponse;
import emlakburada.model.Address;
import emlakburada.repository.AddressRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressService implements AddressServiceImpl{

    @Autowired
    AddressRespository addressRespository;

    @Override
    public AddressResponse create(AddressRequest addressRequest) {

        Address address = convertToAddressEntity(addressRequest);
        addressRespository.saveAndFlush(address);
        return convertToAddresResponse(address);
    }

    @Override
    public List<AddressResponse> findAll() {

        List<Address> address = addressRespository.findAll();
        List<AddressResponse> addressResponseList = new ArrayList<>();
        for (Address address1 : address) {
            addressResponseList.add(convertToAddresResponse(address1));
        }
        return addressResponseList;
    }

    @Override
    public AddressResponse update(Integer id, AddressRequest addressRequest) {
       Address address = addressRespository.getById(id);
       // BeanUtils.copyProperties(kaynak, hedef) kopyalama yapar
        // Yeni ögrendim eklemek eklemek istedim
        BeanUtils.copyProperties(convertToAddressEntity(addressRequest), address);
        addressRespository.saveAndFlush(address);
        return convertToAddresResponse(address);
    }

    @Override
    public Boolean delete(Integer id) {
      try {
          addressRespository.deleteById(id);
      } catch (Exception e){
          e.printStackTrace();
      }
      return true;
    }

    protected Address convertToAddressEntity(AddressRequest addressRequest) {
       Address address = new Address();
       address.setDescription(addressRequest.getDescription());
       address.setUser(addressRequest.getUser());
       address.setCounty(addressRequest.getCounty());
        return address;
    }

    protected AddressResponse convertToAddresResponse(Address address) {
        AddressResponse addressResponse = new AddressResponse();
        addressResponse.setCounty(address.getCounty());
        addressResponse.setDistrict(address.getDistrict());
        addressResponse.setDescription(address.getDescription());
        return addressResponse;
    }
}
