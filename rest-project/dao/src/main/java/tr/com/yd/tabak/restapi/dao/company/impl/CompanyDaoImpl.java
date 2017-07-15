package tr.com.yd.tabak.restapi.dao.company.impl;

import tr.com.yd.tabak.commons.dto.CompanyDTO;
import tr.com.yd.tabak.restapi.converter.CompanyConverter;
import tr.com.yd.tabak.restapi.dao.base.impl.BaseDaoImpl;
import tr.com.yd.tabak.restapi.dao.company.CompanyDao;
import tr.com.yd.tabak.restapi.domain.entity.Company;

public class CompanyDaoImpl extends BaseDaoImpl<Company, CompanyDTO, CompanyConverter> implements CompanyDao{

}
