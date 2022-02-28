package emlakburada.dto.response;

import emlakburada.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class UserResponse {

	private Integer id;
	private UserType userType; 
	private String name;
	private String email;
	private String photo;
	private String bio;
	public UserResponse(Integer id, UserType userType, String name, String email, String photo, String bio) {
		super();
		this.id = id;
		this.userType = userType;
		this.name = name;
		this.email = email;
		this.photo = photo;
		this.bio = bio;
	}
	public UserResponse() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}

}
