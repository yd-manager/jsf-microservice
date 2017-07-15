package tr.com.yd.tabak.commons.dto;


public class CompanyDTO extends BaseDTO{

	private String companyName;

	private UserDTO userDTO;

	//GETTER AND SETTER
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	

	

}
