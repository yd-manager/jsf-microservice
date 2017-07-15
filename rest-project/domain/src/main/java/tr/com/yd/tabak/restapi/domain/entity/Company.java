package tr.com.yd.tabak.restapi.domain.entity;

public class Company extends BaseEntity{
	private String companyName;
	
	private User user;

	//GETTER AND SETTER
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
