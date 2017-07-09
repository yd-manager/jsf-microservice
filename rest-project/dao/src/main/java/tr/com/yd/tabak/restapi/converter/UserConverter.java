package tr.com.yd.tabak.restapi.converter;

import org.springframework.stereotype.Component;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.domain.entity.User;

@Component
public class UserConverter implements Converter<UserDTO, User>{

	@Override
	public User toEntity(UserDTO d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO toDTO(User e) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(50L);
		userDTO.setUsername("ali");
		return userDTO;
	}

}
