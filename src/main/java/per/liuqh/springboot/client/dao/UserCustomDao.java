package per.liuqh.springboot.client.dao;

import java.util.List;

import per.liuqh.springboot.client.entity.User;

public interface UserCustomDao {
	/** 
     * 根据属性名，属性值查询 
     * @param prop 属性名 
     * @param value 属性值 
     * @return 符合条件的 Customer list 集合 
     */  
    List<User> getByProp(String prop, Object value);  
}
