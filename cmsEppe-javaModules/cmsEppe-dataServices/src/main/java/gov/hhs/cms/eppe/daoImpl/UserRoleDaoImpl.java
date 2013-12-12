package gov.hhs.cms.eppe.daoImpl;

import java.util.Date;

import gov.hhs.cms.eppe.dao.UserRoleDao;
import gov.hhs.cms.eppe.vo.UserRoleVO;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserRoleDaoImpl extends HibernateDaoSupport implements UserRoleDao {
	
	public void saveOrUpdateUserRole(UserRoleVO userRoleVO){
		
		System.out.println("-----------Data zone Hibernate-------------");
		System.out.println(userRoleVO.toString());
		
		userRoleVO.setUserUpdtUserId(null);
		userRoleVO.setUserIdCreat("aa");
		userRoleVO.setUserEntId(null);
		userRoleVO.setUpdateTs(null);
		
		Date userEfctvDt= new Date();
		userRoleVO.setUserEfctvDt(userEfctvDt);
		
		Date creatTs= new Date();
		userRoleVO.setCreatTs(creatTs);
		
		userRoleVO.setUserTrmntnDt(null);
		
		String queryString = "from user";  // HQL
		this.getHibernateTemplate().find(queryString);
		
	}


}

