package emlakburada.controller;

import emlakburada.dto.MessageRequest;
import emlakburada.dto.response.MessageResponse;
import emlakburada.dto.response.UserResponse;
import emlakburada.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/message")
public class MessageController {

    @Autowired
    MessageServiceImpl messageService;

    @PostMapping()
    public ResponseEntity<?> saveMessage(@RequestBody MessageRequest messageRequest) {
        messageService.create(messageRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<MessageResponse>> getAllUser() {
        return new ResponseEntity<>(messageService.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(messageService.delete(id), HttpStatus.OK);
    }
}
