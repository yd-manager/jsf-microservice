package tr.com.yd.tabak.restapi.dao.base;

import tr.com.yd.tabak.commons.dto.BaseDTO;
import tr.com.yd.tabak.restapi.converter.BaseConverter;
import tr.com.yd.tabak.restapi.domain.entity.BaseEntity;

public interface BaseDao <E extends BaseEntity,D extends BaseDTO,C extends BaseConverter<D,E>>{
	
	public D insert(D dto);
	
	public D update(D dto);
}
