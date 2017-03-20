package per.liuqh.springboot.client.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import per.liuqh.springboot.client.entity.User;

@Repository
public class UserCustomDaoImpl implements UserCustomDao {

		@PersistenceContext
		private EntityManager em;  
		
	    public void setEm(EntityManager em) {  
	        this.em = em;  
	    }  
	  
	    @Override  
	    public List<User> getByProp(String prop, Object value) {  
	        String sql = "from User  where "+prop+" = :value";  
	        Query query =  em.createQuery(sql); 
	        query.setParameter("value", value);  
			List<User> list = query.getResultList();
	        return list;  
	    }  
	
}
