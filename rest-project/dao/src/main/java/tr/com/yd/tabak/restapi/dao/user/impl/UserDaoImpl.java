package tr.com.yd.tabak.restapi.dao.user.impl;

import org.springframework.stereotype.Repository;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.converter.UserConverter;
import tr.com.yd.tabak.restapi.dao.base.impl.BaseDaoImpl;
import tr.com.yd.tabak.restapi.dao.user.UserDao;
import tr.com.yd.tabak.restapi.domain.entity.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User,UserDTO,UserConverter> implements UserDao {

}