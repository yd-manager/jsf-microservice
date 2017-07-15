package tr.com.yd.tabak.restapi.service.company;

import tr.com.yd.tabak.commons.dto.CompanyDTO;
import tr.com.yd.tabak.commons.dto.UserDTO;
import tr.com.yd.tabak.restapi.service.base.BaseService;

public interface CompanyService extends BaseService{

	public CompanyDTO save(CompanyDTO companyDTO);
}
