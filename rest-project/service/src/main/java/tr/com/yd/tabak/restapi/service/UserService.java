package tr.com.yd.tabak.restapi.service;

import tr.com.yd.tabak.restapi.dao.UserDao;
import tr.com.yd.tabak.restapi.domain.dto.UserDTO;

public class UserService extends BaseService {

	private UserDao userDao;
	
	public UserDTO save(UserDTO userDTO)
	{
		return userDao.insert(userDTO);
	}
}
