package test;

public  class FX2 {  
    private Object ob; // 定义泛型成员变量  
  
    public FX2(Object ob) {  
        this.ob = ob;  
    }  
  
    public Object getOb() {  
        return ob;  
    }  
  
    public void showTyep() {  
        System.out.println("T的实际类型是: " + ob.getClass().getName());  
    }  

  
    public static void main(String[] args) {  
        FX2 intOb = new FX2(new Integer(100));  
        intOb.showTyep();  
        System.out.println("value= " + intOb.getOb());  
        System.out.println("----------------------------------");  
  
        FX2 strOb = new FX2("CSDN_SEU_Calvin");  
        strOb.showTyep();  
        System.out.println("value= " + strOb.getOb());  
    }  
}