package tr.com.yd.tabak.restapi.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.dao.user.UserDao;
import tr.com.yd.tabak.restapi.service.base.BaseService;

@Service
public interface UserService extends BaseService {

	public UserDTO save(UserDTO userDTO);
	
}
