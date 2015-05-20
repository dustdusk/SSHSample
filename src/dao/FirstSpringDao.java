package dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import entity.SshMasterTable;

public class FirstSpringDao<T> {
	//使用Annotation的方式取得Spring中設定好的Bean
	@Resource
	private SessionFactory sessionFactory = null;

    
	@SuppressWarnings("unchecked")
	public List<T> query(T entity ){
		return query(entity, false);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> query(T entity, Boolean newSession ){
		Criteria criteria = null;
		if(newSession){
			criteria = sessionFactory.openSession().createCriteria(entity.getClass());
		} else {
			//使用Spring做trancation控管
			criteria = sessionFactory.getCurrentSession().createCriteria(entity.getClass());
		}
		//criteria.add(Restrictions.eq("", "1")); //加入查詢條件
		return criteria.list();
	}

	
	public void insert(){
		
	}
}
