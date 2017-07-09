package tr.com.yd.tabak.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.dao.UserDao;

@Service
public class UserService extends BaseService {

	@Autowired
	private UserDao userDao;
	
	public UserDTO save(UserDTO userDTO)
	{
		return userDao.insert(userDTO);
	}
	
}
