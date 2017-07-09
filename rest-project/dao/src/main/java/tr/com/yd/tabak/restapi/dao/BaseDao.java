package tr.com.yd.tabak.restapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.tabak.commons.dto.BaseDTO;
import tr.com.yd.tabak.restapi.converter.Converter;
import tr.com.yd.tabak.restapi.domain.entity.BaseEntity;

public class BaseDao<E extends BaseEntity,D extends BaseDTO,C extends Converter<D,E>> {

	@Autowired
	private C converter;
	
	public D insert(D dto)
	{
		E entity = converter.toEntity(dto);
		// insert
		return converter.toDTO(entity);
	}
	

}
