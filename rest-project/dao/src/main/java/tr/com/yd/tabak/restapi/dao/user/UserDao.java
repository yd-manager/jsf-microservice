package tr.com.yd.tabak.restapi.dao.user;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.converter.UserConverter;
import tr.com.yd.tabak.restapi.dao.base.BaseDao;
import tr.com.yd.tabak.restapi.domain.entity.User;


public interface UserDao extends BaseDao<User,UserDTO,UserConverter>{

}

