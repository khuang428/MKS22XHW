import java.util.*;

public class MyQueue<T>{
    private MyLinkedList<T> data;

    public void enqueue(T item){
	data.add(item);
    }
  
    public T dequeue(){
	if(isEmpty()){
	    throw new NoSuchElementException();
	}
	return data.remove(0);
    }

    public T peek(){
	if(isEmpty()){
	    throw new NoSuchElementException();
	}
	return data.get(0);
    }

    public int size(){
	return data.size();
    }

    public boolean isEmpty(){
	return size() == 0;
    }
}
