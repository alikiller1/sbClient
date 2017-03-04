package test;

import java.util.ArrayList;
import java.util.List;

public  class TestListener<T> {
	public   List<Listener<T>> list;
	public void init(){
		list = new ArrayList<Listener<T>>();
		Listener<T> a=new ListenerA<T>();
		Listener<T> b=new ListenerB<T>();
		list.add(a);
		list.add(b);
	}

	public   void addEvent(T o) {
		for (int i = 0; i < list.size(); i++) {
			Listener<T> t = list.get(i);
			t.doSome(o);
		}
	}

	public static    void main(String[] args) {
		TestListener t=new TestListener();
		t.init();
		t.addEvent(new EventA());
		t.addEvent(new EventB());
	}

}
