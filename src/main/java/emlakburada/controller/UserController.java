package emlakburada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import emlakburada.dto.UserRequest;
import emlakburada.dto.response.UserResponse;
import emlakburada.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public ResponseEntity<?> saveUser(@RequestBody UserRequest request) {
		userService.create(request);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/users")
	public ResponseEntity<List<UserResponse>> getAllUser() {
		return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
	}

	@PostMapping("/users/{id}")
	public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody UserRequest userRequest) {
		return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(userService.delete(id), HttpStatus.OK);
	}
}
