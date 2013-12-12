package gov.hhs.cms.eppe.daoImpl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import gov.hhs.cms.eppe.dao.DuaDao;
import gov.hhs.cms.eppe.vo.DuaVO;

public class DuaDaoImpl extends HibernateDaoSupport implements DuaDao {

	public void saveOrUpdateDua(DuaVO duaVO) {
		
/*		System.out.println("-----------Data zone Hibernate-------------");
		System.out.println(duaVO.toString()); 
		this.getHibernateTemplate().saveOrUpdate(duaVO);*/

	}

}
