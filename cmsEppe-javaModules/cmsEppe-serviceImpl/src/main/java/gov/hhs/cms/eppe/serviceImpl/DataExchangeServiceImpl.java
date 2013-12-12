package gov.hhs.cms.eppe.serviceImpl;

import gov.hhs.cms.eppe.dao.UserDao;
import gov.hhs.cms.eppe.dao.UserRoleDao;
import gov.hhs.cms.eppe.service.DataExchangeService;
import gov.hhs.cms.eppe.vo.UserRoleVO;
import gov.hhs.cms.eppe.vo.UserVO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DataExchangeServiceImpl extends HibernateDaoSupport implements DataExchangeService {

	//private DuaDao duaDao;
	
	private UserDao userDao;
	private UserRoleDao userRoleDao;
	
	public void saveUser(UserVO userVO){
		
		System.out.println("-----------Data zone Service Logic-------------");
		System.out.println(userVO.toString());
		System.out.println(userVO.getUserId());
		userDao.saveOrUpdateUser(userVO);
		
	}
	
	public UserDao getUserDao(){
		
		return userDao;
	}
	
	public void setUserDao(UserDao userDao){
		
		this.userDao = userDao;
	}
	
	
	
	public String checkUser(UserVO userVO){
		String temp= "";
		try{
			
			System.out.println("------------Check register status-------------");
			for(UserVO userVO1:getUserVO()){
				if(userVO1.getUserId().equalsIgnoreCase(userVO.getUserId())){
					for(UserRoleVO userRoleVO:getUserRoleVO()){
						if(userRoleVO.getUserId().equalsIgnoreCase(userRoleVO.getUserId())){
							System.out.println("--------find userId in the UserRole table--------");
							temp = "both";
							break;
						}
						else{
							temp="signle";
						}
					}
					break;				
				}
				else{
					temp="none";
				}
			}
			System.out.println("Value of Temp:" + temp);
			return temp;
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return temp;
		
		
	}

	public List<UserVO> getUserVO(){
		try{
			SessionFactory sessionFactory = this.getHibernateTemplate().getSessionFactory();
			Session session =  sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<UserVO> User = session.createQuery("FROM UserVO").list();
			tx.commit();
			session.close();
			return User;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<UserRoleVO> getUserRoleVO(){
		try{
			SessionFactory sessionFactory = this.getHibernateTemplate().getSessionFactory();
			Session session =  sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<UserRoleVO> UserRole = session.createQuery("FROM UserRoleVO").list();
			tx.commit();
			session.close();
			return UserRole;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}

	
	
/*
	 public void saveDua(DuaVO duaVO){
		
		System.out.println("-----------Data zone Service Logic-------------");
		System.out.println(duaVO.toString()); 
		duaDao.saveOrUpdateDua(duaVO);
		
	 }

	public DuaDao getDuaDao() {
		return duaDao;
	}

	public void setDuaDao(DuaDao duaDao) {
		this.duaDao = duaDao;
	}*/

	
}
