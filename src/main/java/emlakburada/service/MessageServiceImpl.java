package emlakburada.service;

import emlakburada.dto.AdvertRequest;
import emlakburada.dto.MessageRequest;
import emlakburada.dto.response.AdvertResponse;
import emlakburada.dto.response.MessageResponse;

import java.util.List;

public interface MessageServiceImpl {
    MessageResponse create(MessageRequest messageRequest);

    List<MessageResponse> findAll();

    MessageResponse update(Integer id, MessageRequest messageRequest);

    Boolean delete(Integer id);
}
