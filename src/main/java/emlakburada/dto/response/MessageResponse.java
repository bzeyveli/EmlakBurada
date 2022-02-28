package emlakburada.dto.response;

import emlakburada.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageResponse {

    private Integer id;
    private String title;
    private String desription;
    private Date sendDate;
    private Date readDate;
    private boolean status;
    private User senderUserId;
    private User customerId;
}
