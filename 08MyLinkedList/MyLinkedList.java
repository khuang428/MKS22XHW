public class MyLinkedList<T>{
    private int size;
    private LNode start,end;
    
    private class LNode{
	private T data;
	private LNode next;

	public LNode(T val){
	    data = val;
	}

	public LNode(T val,LNode node){
	    data = val;
	    next = node;
	}
	
	public void setNext(LNode node){
	    next = node;
	}

	public void setValue(T val){
	    data = val;
	}

	public LNode getNext(){
	    return next;
	}

	public T getValue(){
	    return data;
	}
    }

    public MyLinkedList(){   
    }

    public T get(int index){
	LNode current = start;
	for(int i = 0;i < size;i++){
	    if(i == index){
		return current.getValue();
	    }
	    current = current.getNext();
	}
	return null;
    }

    public T set(int index,T newValue){
	T ret = null;
	LNode current = start;
	for(int i = 0;i < size;i++){
	    if(i == index){
		ret = current.getValue();
		current.setValue(newValue);
		return ret;
	    }
	    current = current.getNext();
	}
	return ret;
    }
    
    public int size(){
	return size;
    }

    public T remove(int index){
	T ret = null;
	    if(size > 0 && index == 0){
		ret = start.getValue();
		start = start.getNext();
	    }else if(index > 0 && index < size){
		LNode current = start;
		for(int i = 0;i < index - 1;i++){
		    current = current.getNext();
		}
		ret = current.getNext().getValue();
		current.setNext(current.getNext().getNext());
		if(index == size - 1){
		    end = current;
		}
	    }
	    size--;
	    return ret;
    }

    public boolean add(T value){
	if(size == 0){
	    start = new LNode(value);
	    end = start;
	}else{
	    end.setNext(new LNode(value));
	    end = end.getNext();
	}
	size++;
	return true;
    }

    public boolean add(int index,T value){
	if(index > size || index < 0){
	    return false;
	}
	if(index == size){
	    return add(value);
	}
	if(index == 0){
	    start = new LNode(value,start);
	}else{
	    LNode current = start;
	    for(int i = 0;i < index -1;i++){
		current = current.getNext();
	    }
	    current.setNext(new LNode(value,current.getNext()));
	}
	size++;
	return true;
    }

    public int indexOf(T value){
	LNode current = start;
	for(int i = 0;i < size;i++){
	    if(current.getValue().equals(value)){
		return i;
	    }
	    current = current.getNext();
	}
	return -1;
    }
	
    public String toString(){
	String retStr = "[";
	LNode current = start;
	for(int i = 0;i < size - 1;i++){
	    retStr += current.getValue() + ",";
	    current = current.getNext();
	}
	return retStr + current.getValue() + "]";
    }

    
}
