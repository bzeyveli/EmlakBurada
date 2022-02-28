package emlakburada.dto;

import emlakburada.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class AddressRequest {

    private User user;
    private String county;
    private String district;
    private String description;
    
	public AddressRequest() {
	}

	public AddressRequest(User user, String county, String district, String description) {
		super();
		this.user = user;
		this.county = county;
		this.district = district;
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
  
}
