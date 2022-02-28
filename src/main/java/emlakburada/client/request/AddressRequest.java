package emlakburada.client.request;

public class AddressRequest {

	private String province;
	private String district;
	private String addresDesc;
	
	public AddressRequest() {
		super();
	}
	
	public AddressRequest(String province, String district, String addresDesc) {
		this.province = province;
		this.district = district;
		this.addresDesc = addresDesc;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddresDesc() {
		return addresDesc;
	}
	public void setAddresDesc(String addresDesc) {
		this.addresDesc = addresDesc;
	}

	
}
