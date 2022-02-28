package emlakburada.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    private String title;
    private String desription;
    private Date sendDate;
    private Date readDate;
    private boolean status;

    @OneToOne(fetch = FetchType.LAZY)
    private User senderUser;
    @OneToOne(fetch = FetchType.EAGER)
    private User customer;

    public Message(String title) {
        this.title = title;
    }

    public Message() {

    }

    public Message(Integer id, String title, String desription, Date sendDate, Date readDate, boolean status,
                   User senderUser, User customer) {
        this.id = id;
        this.title = title;
        this.desription = desription;
        this.sendDate = sendDate;
        this.readDate = readDate;
        this.status = status;
        this.senderUser = senderUser;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getSenderUser() {
        return senderUser;
    }

    public void setSenderUser(User senderUser) {
        this.senderUser = senderUser;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

}
