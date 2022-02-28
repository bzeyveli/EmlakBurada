package emlakburada.dto;

import emlakburada.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserRequest {

	private UserType userType;
	private String name;
	private String email;
	private String photo;
	private String bio;
	
	public UserRequest(UserType userType, String name, String email, String photo, String bio) {
		super();
		this.userType = userType;
		this.name = name;
		this.email = email;
		this.photo = photo;
		this.bio = bio;
	}

	public UserRequest() {
		super();
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
