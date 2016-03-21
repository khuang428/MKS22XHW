public class MyLinkedList{
    int size;
    LNode start,end;
    
    private class LNode{
	int data;
	LNode next;

	public LNode(int num){
	    data = num;
	}

	public LNode(int num,LNode node){
	    data = num;
	    next = node;
	}
	
	public void setNext(LNode node){
	    next = node;
	}

	public void setValue(int num){
	    data = num;
	}

	public LNode getNext(){
	    return next;
	}

	public int getValue(){
	    return data;
	}
    }

    public MyLinkedList(){   
    }

    public int get(int index){
	LNode current = start;
	for(int i = 0;i < size;i++){
	    if(i == index){
		return current.getValue();
	    }
	    current = current.getNext();
	}
	return 0;
    }

    public int set(int index,int newValue){
	int retNum = 0;
	LNode current = start;
	for(int i = 0;i < size;i++){
	    if(i == index){
		retNum = current.getValue();
		current.setValue(newValue);
		return retNum;
	    }
	    current = current.getNext();
	}
	return newValue;
    }
    
    public int size(){
	return size;
    }

    public int remove(int index){
	int retNum = 0;
	    if(size > 0 && index == 0){
		retNum = start.getValue();
		start = start.getNext();
	    }else if(index > 0 && index < size){
		LNode current = start;
		for(int i = 0;i < index - 1;i++){
		    current = current.getNext();
		}
		retNum = current.getNext().getValue();
		current.setNext(current.getNext().getNext());
		if(index == size - 1){
		    end = current;
		}
	    }
	    size--;
	    return retNum;
    }

    public boolean add(int value){
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

    public boolean add(int index,int value){
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

    public int indexOf(int value){
	LNode current = start;
	for(int i = 0;i < size;i++){
	    if(current.getValue() == value){
		return i;
	    }
	    current = current.getNext();
	}
	return -1;
    }
	
    public String toString(){
	String retStr = "[";
	LNode current = start;
	for(int i = 0;i<size;i++){
	    retStr += current.getValue();
	    current = current.getNext();

	}
	return retStr + "]";
    }

    
}
