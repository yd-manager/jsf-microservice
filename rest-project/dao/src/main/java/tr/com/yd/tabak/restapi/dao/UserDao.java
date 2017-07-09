package tr.com.yd.tabak.restapi.dao;

import org.springframework.stereotype.Repository;

import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.converter.UserConverter;
import tr.com.yd.tabak.restapi.domain.entity.User;

@Repository
public class UserDao extends BaseDao<User,UserDTO,UserConverter> {

}
