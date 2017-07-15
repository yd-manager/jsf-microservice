import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tr.com.yd.tabak.commons.dto.UserDTO;

@ManagedBean
@ViewScoped
public class TestBean {

	private UserDTO userDTO;
	
	@PostConstruct
	public void init()
	{
		userDTO = new UserDTO();
		userDTO.setId(50L);
		userDTO.setUsername("user");
		userDTO.setPassword("password");
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	
	
	
}
