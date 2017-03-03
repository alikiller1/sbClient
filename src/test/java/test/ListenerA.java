package test;

public class  ListenerA<E> implements Listener<E> {

	@Override
	public void doSome(E a) {
		if(a instanceof EventA){
			System.out.println("------>A");
		}
	}


}
