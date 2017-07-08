package tr.com.yd.tabak.restapi.domain.converter;

import tr.com.yd.tabak.restapi.domain.entity.BaseEntity;

public interface Convertable<E extends BaseEntity> {

	E toEntity();
}
