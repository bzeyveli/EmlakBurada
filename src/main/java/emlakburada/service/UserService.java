package emlakburada.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.dto.UserRequest;
import emlakburada.dto.response.UserResponse;
import emlakburada.model.User;
import emlakburada.repository.UserRepository;

@Service
public class UserService extends UserBaseService implements UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest userRequest) {
        // userRequest objesini user objesine dönüştürdüm. Burada set yerine modelmapper kullanılabilir.
        // user objesini veritabanı ile servis arasında kullanıdım.
        User user = convertToUserEntity(userRequest);
        user = userRepository.saveAndFlush(user);

        // veritabanına kaydedilen user nesnesini userRequest nesnesine dönüştürdüm
        UserResponse userResponse = convertToUserResponse(user);
        return userResponse;
    }

    @Override
    public List<UserResponse> findAll() {
        List<User> listUser = userRepository.findAll();
        List<UserResponse> list = new ArrayList<>();
        for (User user: listUser) {
             list.add(convertToUserResponse(user));
        }
        return list;
    }

    @Override
    public UserResponse update(Integer id, UserRequest userRequest) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty()){
            User user = userOptional.get();
            user.setName(userRequest.getName());
            user.setEmail(userRequest.getEmail());
            user.setEmail(userRequest.getBio());
            user.setPhoto(userRequest.getPhoto());
            user.setUserType(userRequest.getUserType());
            user = userRepository.saveAndFlush(user);
            return convertToUserResponse(user);
        }
        return null;
    }

    // kullancıyı veritabanından silmek yerine status sütünu oluşturup aktif pasif yapabiliriz.
    // kullanıcıyı silmek önerilen birşey degil... Ama burda sildim :)
    @Override
    public Boolean delete(Integer id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
}
