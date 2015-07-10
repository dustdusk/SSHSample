package dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public class FirstSpringDao<T> {
	//�ϥ�Annotation���覡���oSpring���]�w�n��Bean
	@Resource
	private SessionFactory sessionFactory = null;

    
	public List<T> query(T entity ){
		return query(entity, false);
	}

	
	@SuppressWarnings("unchecked")
	public List<T> query(T entity, Boolean newSession ){
		Criteria criteria = null;
		if(newSession){
			criteria = sessionFactory.openSession().createCriteria(entity.getClass());
		} else {
			//�ϥ�Spring��trancation����
			Session session = sessionFactory.getCurrentSession();
			criteria = session.createCriteria(entity.getClass());
		}
		//criteria.add(Restrictions.eq("", "1")); //�[�J�d�߱���
		return criteria.list();
	}

	
	public void insert(){
		
	}
}
