package emlakburada.service;

import emlakburada.dto.UserRequest;
import emlakburada.dto.response.UserResponse;

import java.util.List;

public interface UserServiceImpl {

    UserResponse create(UserRequest userRequest);
    List<UserResponse> findAll();
    UserResponse update(Integer id, UserRequest userRequest);
    Boolean delete(Integer id);
}
