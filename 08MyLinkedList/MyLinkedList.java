public class MyLinkedList{
    private int size;
    private LNode start;
    
    private class LNode{
	private int data;
	private LNode next;

	public LNode(int num){
	    data = num;
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
	size = 0;
	start = null;
    }

    public boolean add(int value){
	return add(size,value);
    }

    public boolean add(int index, int value){
	LNode current = start;
	int ctr = 0;
	while(current.getNext() != null){
	    current = current.getNext();
	}
    }
	
    public String toString(){
	retStr = "[";
	LNode current = start;
	for(int i = 0;i<size;i++){
	    retStr += current.getValue();
	    current = current.getNext();
	}
	return retStr + "]";
    }

    
}
