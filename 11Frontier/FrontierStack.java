import java.util.*;

public class FrontierStack<T> implements Frontier<T>{
    private Stack<T> s = new Stack<T>();

    public void add(T element){
	s.push(element);
    }

    public T next(){
	return s.pop();
    }

    public boolean hasNext(){
	try{
	    s.peek();
	}catch(EmptyStackException e){
	    return false;
	}
	return true;
    }
}
