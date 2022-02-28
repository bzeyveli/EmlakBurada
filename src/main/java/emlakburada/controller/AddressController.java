package emlakburada.controller;

import emlakburada.dto.AddressRequest;
import emlakburada.dto.UserRequest;
import emlakburada.dto.response.AddressResponse;
import emlakburada.dto.response.UserResponse;
import emlakburada.service.AddressServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/address")
public class AddressController {

    @Autowired
    AddressServiceImpl addressService;

    @PostMapping()
    public ResponseEntity<?> saveAddress(@RequestBody AddressRequest addressRequest) {
        addressService.create(addressRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<AddressResponse>> getAllUser() {
        return new ResponseEntity<>(addressService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody AddressRequest addressRequest) {
        return new ResponseEntity<>(addressService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(addressService.delete(id), HttpStatus.OK);
    }
}
