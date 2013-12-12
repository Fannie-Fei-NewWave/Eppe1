package gov.hhs.cms.eppe.service;

import gov.hhs.cms.eppe.vo.UserVO;


public interface DataExchangeService {

	 //public void saveDua(DuaVO duaVO);
	 public void saveUser(UserVO userVO);
	 public String checkUser(UserVO userVO);
}
