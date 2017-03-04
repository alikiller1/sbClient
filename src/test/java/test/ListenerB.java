package test;

public class ListenerB<E> implements Listener<E>{

	@Override
	public void doSome(E b) {
		if(b instanceof EventB){
			System.out.println("------>B");
		}
		
	}

}
