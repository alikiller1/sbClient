package test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TEtest {
	public static void main(String[] args) {
		
	}
	
	public static void f1(){

		List list = new ArrayList();  
		list.add("CSDN_SEU_Cavin");  
		list.add(100);  
		for (int i = 0; i < list.size(); i++) {  
		  String name = (String) list.get(i); //取出Integer时，运行时出现异常  
		System.out.println("name:" + name);  
		}  
	
	}
	
	public static void f2(){
		ArrayList<String> a = new ArrayList<String>();  
		a.add("CSDN_SEU_Cavin"); 
		//a.add(100);编译出错
		Class c = a.getClass();  
		try{  
		    Method method = c.getMethod("add",Object.class); 
		    method.invoke(a,100);  
		    System.out.println(a);  
		}catch(Exception e){  
		    e.printStackTrace();  
		}  
	}
}
