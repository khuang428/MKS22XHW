import java.util.*;

public class MyQueue<T>{
    private MyLinkedList<T> data = new MyLinkedList<T>();

    public MyQueue(){
    }

    public void enqueue(T item){
	data.add(item);
    }
  
    public T dequeue(){
	if(isEmpty()){
	    throw new NoSuchElementException("No elements");
	}
	return data.remove(0);
    }

    public T peek(){
	if(isEmpty()){
	    throw new NoSuchElementException("No elements");
	}
	return data.get(0);
    }

    public int size(){
	return data.size();
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public static void main(String[]args){
	MyQueue<String> q = new MyQueue<String>();
	q.peek();
	q.dequeue();
	System.out.println(q.isEmpty());
	q.enqueue("hi");
	System.out.println(q.size());
	System.out.println(q.peek());
	System.out.println(q.dequeue());
	System.out.println(q.size());
    }
}
