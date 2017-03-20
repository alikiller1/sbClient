package per.liuqh.springboot.client.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import per.liuqh.springboot.client.entity.User;

public interface UserDao extends CrudRepository<User, Integer>{
	
	//根据query语句查询  
    @Query(value = " from User  where name = :name")  
    List<User> getByName(@Param("name") String name);  
}
