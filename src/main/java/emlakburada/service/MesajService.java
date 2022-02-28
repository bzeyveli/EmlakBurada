package emlakburada.service;

import emlakburada.dto.MessageRequest;

import emlakburada.dto.response.MessageResponse;
import emlakburada.model.Message;
import emlakburada.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MesajService implements MessageServiceImpl {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public MessageResponse create(MessageRequest messageRequest) {
        Message message = convertToMessageEntity(messageRequest);
        message = messageRepository.saveAndFlush(message);
        return convertToMessageResponse(message);
    }

    @Override
    public List<MessageResponse> findAll() {

        List<Message> messageList = messageRepository.findAll();
        List<MessageResponse> messageResponseList = new ArrayList<>();
        for (Message message : messageList) {
            messageResponseList.add(convertToMessageResponse(message));
        }
       return messageResponseList;
    }

    //message düzenleme olabilir diye ekledim.
    @Override
    public MessageResponse update(Integer id, MessageRequest messageRequest) {
        return null;
    }


    @Override
    public Boolean delete(Integer id) {
        try {
            messageRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    protected Message convertToMessageEntity(MessageRequest messageRequest) {
        Message message = new Message();
        message.setTitle(messageRequest.getTitle());
        message.setDesription(messageRequest.getDesription());
        message.setSendDate(new Date());
        message.setSenderUser(messageRequest.getSenderUserId());
        message.setCustomer(messageRequest.getCustomerId());
        return message;
    }

    protected MessageResponse convertToMessageResponse(Message message) {
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setTitle(message.getTitle());
        messageResponse.setDesription(message.getDesription());
        messageResponse.setSenderUserId(message.getSenderUser());
        messageResponse.setCustomerId(message.getCustomer());
        return messageResponse;
    }
}
