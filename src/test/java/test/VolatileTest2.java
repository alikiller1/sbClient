package test;
public class VolatileTest2 {
    volatile int a;
    public void change(){
      a=a+1;
    }

    public void print(){
    	System.out.println("a="+a);
       
    }

    public static void main(String[] args) {
        while (true){
            final VolatileTest2 test = new VolatileTest2();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.change();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.print();
                }
            }).start();

        }
    }
}
