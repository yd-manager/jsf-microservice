package tr.com.yd.tabak.restapi.dao.company;

import tr.com.yd.tabak.commons.dto.BaseDTO;
import tr.com.yd.tabak.commons.dto.CompanyDTO;
import tr.com.yd.tabak.restapi.converter.CompanyConverter;
import tr.com.yd.tabak.restapi.converter.BaseConverter;
import tr.com.yd.tabak.restapi.dao.base.BaseDao;
import tr.com.yd.tabak.restapi.domain.entity.BaseEntity;
import tr.com.yd.tabak.restapi.domain.entity.Company;

public interface CompanyDao extends BaseDao<Company, CompanyDTO, CompanyConverter> {

}
