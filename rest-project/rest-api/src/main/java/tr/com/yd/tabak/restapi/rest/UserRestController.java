package tr.com.yd.tabak.restapi.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin("*")
public class UserRestController extends BaseRestController {

	@Autowired
	private UserService userService;
	
	@CrossOrigin("*")
	@RequestMapping(path="insert",method=RequestMethod.POST)
	public UserDTO insertUser(UserDTO userDTO)
	{
		return userService.save(userDTO);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="all",method=RequestMethod.GET)
	public List<UserDTO> getAllUser()
	{
		List<UserDTO> result = new ArrayList();
		UserDTO userDTO = new UserDTO();
		userDTO.setId(50L);
		userDTO.setUsername("ali");
		result.add(userDTO);
		
		userDTO = new UserDTO();
		userDTO.setId(51L);
		userDTO.setUsername("veli");
		result.add(userDTO);
		return result;
	}
}
