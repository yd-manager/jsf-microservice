package tr.com.yd.tabak.restapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.service.UserService;

@RestController
@RequestMapping("user")
public class UserRestController extends BaseRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(path="insert",method=RequestMethod.POST)
	public UserDTO insertUser(UserDTO userDTO)
	{
		return userService.save(userDTO);
	}
}
