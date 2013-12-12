package gov.hhs.cms.eppe.dao;

import gov.hhs.cms.eppe.vo.UserVO;

public interface UserDao {

	public void saveOrUpdateUser(UserVO userVO);
}
