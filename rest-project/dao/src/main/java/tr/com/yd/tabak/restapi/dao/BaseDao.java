package tr.com.yd.tabak.restapi.dao;

import tr.com.yd.tabak.restapi.domain.dto.BaseDTO;

public class BaseDao<D extends BaseDTO> {

	public D insert(D dto)
	{
		dto.toEntity();
		return dto;
	}
}
