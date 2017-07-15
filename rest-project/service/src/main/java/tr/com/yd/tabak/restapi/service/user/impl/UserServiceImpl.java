package tr.com.yd.tabak.restapi.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.dao.user.UserDao;
import tr.com.yd.tabak.restapi.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.restapi.service.user.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDTO save(UserDTO userDTO) {
		
		return userDao.insert(userDTO);
	}

}
