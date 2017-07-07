package tr.com.yd.tabak.restapi.domain.dto;

import tr.com.yd.tabak.restapi.domain.entity.User;

public class UserDTO extends BaseDTO<User> {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User toEntity() {
		User user = new User();
		return user;
	}
	
}
