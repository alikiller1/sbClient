package per.liuqh.springboot.annotation;

import java.lang.reflect.Method;

public class TestMyAnnotaion {
	
	@MyAnnotation(name="xingoo",age=25)
    public static void print(Class c) throws NoSuchMethodException, SecurityException{
        System.out.println(c.getName());
        
        //java.lang.Class的getAnnotation方法，如果有注解，则返回注解。否则返回null
        Method m= c.getMethod("print", Class.class);
        MyAnnotation person = (MyAnnotation)m.getAnnotation(MyAnnotation.class);
        
        if(person != null){
            System.out.println("name:"+person.name()+" age:"+person.age());
        }else{
            System.out.println("person unknown!");
        }
    }
    
    public static void main(String[] args) throws NoSuchMethodException, SecurityException{
    	TestMyAnnotaion.print(TestMyAnnotaion.class);
    }
}