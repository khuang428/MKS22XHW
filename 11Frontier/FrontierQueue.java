public class FrontierQueue<T> implements Frontier<T>{
    private MyQueue<T> q = new MyQueue<T>();

    public void add(T element){
	q.enqueue(element);
    }

    public T next(){
	return q.dequeue();
    }

    public boolean hasNext(){
	if(q.peek() == null){
	    return false;
	}
	return true;
    }
}
