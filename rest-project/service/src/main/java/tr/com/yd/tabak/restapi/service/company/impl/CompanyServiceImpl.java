package tr.com.yd.tabak.restapi.service.company.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.yd.tabak.commons.dto.CompanyDTO;
import tr.com.yd.tabak.restapi.dao.company.CompanyDao;
import tr.com.yd.tabak.restapi.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.restapi.service.company.CompanyService;

@Service
public class CompanyServiceImpl extends BaseServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public CompanyDTO save(CompanyDTO companyDTO) {
		
		return companyDao.insert(companyDTO);
	}

}
