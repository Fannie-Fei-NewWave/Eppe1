package gov.hhs.cms.eppe.daoImpl;

import gov.hhs.cms.eppe.dao.UserDao;
import gov.hhs.cms.eppe.vo.UserVO;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	public void saveOrUpdateUser(UserVO userVO){
		        		
		System.out.println("-----------Data zone Hibernate-------------");
		System.out.println(userVO.toString());
		
		userVO.setUserFirstName("FirstName");    
		userVO.setUserLastName("LastName");
		userVO.setUserEmailAdr("EmailAdr");
		userVO.setUserStrAdr1("StrAdr1");
		userVO.setUserStrAdr2(null);
		userVO.setUserIdCreat("01");
		userVO.setUserIdUpdt(null);
		userVO.setUserStrCityName("Elkridge");
		userVO.setUserStrState("MD");    
		userVO.setUserStrZip(21075);
		userVO.setPersonPrexCode(01);
		userVO.setUserTypeCode(11);
		userVO.setUserStusCode(22);
		userVO.setPerSfxCode(33);		
		userVO.setUserPhoneNumber(410782047); // phone number should be 10 digits.
		
		Date creatTs= new Date();
		userVO.setCreatTs(creatTs);
		
		userVO.setUpdateTs(null);
		
		this.getHibernateTemplate().saveOrUpdate(userVO);
		
	}
}
