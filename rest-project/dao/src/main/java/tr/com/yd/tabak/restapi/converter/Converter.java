package tr.com.yd.tabak.restapi.converter;

import tr.com.yd.tabak.commons.dto.BaseDTO;
import tr.com.yd.tabak.restapi.domain.entity.BaseEntity;

public interface Converter<D extends BaseDTO,E extends BaseEntity> {
	E toEntity(D d);
	D toDTO(E e);
}
