public class BSTree<T extends Comparable<T>>{
    private class Node{
	T data;
	Node left;
	Node right;
	
	public Node(T data){
	    this.data = data;
	}

	public void setData(T data){
	    this.data = data;
	}

	public void setLeft(Node n){
	    left = n;
	}

	public void setRight(Node n){
	    right = n;
	}

	public T getData(){
	    return data;
	}

	public Node getLeft(){
	    return left;
	}

	public Node getRight(){
	    return right;
	}

	public int height(){ 
	    int h1 = 0,h2 = 0;
	    if(left == null && right == null){
		return 1;
	    }
	    if(left != null){
		h1 = left.height();
	    }
	    if(right != null){
		h2 = right.height();
	    }
	    return Math.max(h1 + 1,h2 + 1);
	}

	public void add(T value){
	    
	}

	public String toString(){
	    String retStr = "" + data + " ";
	    if(left == null){
		retStr += "_";
	    }else{
		retStr += left.toString();
	    }
	    if(right == null){
		retStr += "_";
	    }else{
		retStr += right.toString();
	    }
	    return retStr;
	}

	public boolean contains(T value){
	    return false;
	}
    }

    private Node root;

    //OUTER methods here are wrapper methods for the root
    public int getHeight(){
	if(root == null){
	    return 0;
	}
	return root.height();
    }

    public void add(T value){
	if(root == null){
	    root = new Node(value);
	}else{
	    root.add(value);
	}
    }
    public String toString(){
	if(root == null){
	    return "";
	}
	return root.toString();
    }
    public boolean contains(T value){
	if(root == null){
	    return false;
	}
	return root.contains(value);
    }
}
