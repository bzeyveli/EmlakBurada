package emlakburada.client.response;

import emlakburada.client.request.AddressRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class BannerResponse {

	private int advertNo;
	private String phone;
	private int total;
	private AddressRequest address;
	
	
	public BannerResponse() {
	}

	public BannerResponse(int advertNo, String phone, int total, AddressRequest address) {
		super();
		this.advertNo = advertNo;
		this.phone = phone;
		this.total = total;
		this.address = address;
	}

	public int getAdvertNo() {
		return advertNo;
	}

	public void setAdvertNo(int advertNo) {
		this.advertNo = advertNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public AddressRequest getAddress() {
		return address;
	}

	public void setAddress(AddressRequest address) {
		this.address = address;
	}

}
