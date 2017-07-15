package tr.com.yd.tabak.restapi.dao.base.impl;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.tabak.commons.dto.BaseDTO;
import tr.com.yd.tabak.restapi.converter.BaseConverter;
import tr.com.yd.tabak.restapi.dao.base.BaseDao;
import tr.com.yd.tabak.restapi.domain.entity.BaseEntity;

public class BaseDaoImpl<E extends BaseEntity,D extends BaseDTO,C extends BaseConverter<D,E>> implements BaseDao<E, D, C>{

	@Autowired
	private C converter;
	
	@Override
	public D insert(D dto)
	{
		E entity = converter.toEntity(dto);
		// insert
		return converter.toDTO(entity);
	}

	@Override
	public D update(D dto) {
		E entity = converter.toEntity(dto);
		return converter.toDTO(entity);
	}
	

}
