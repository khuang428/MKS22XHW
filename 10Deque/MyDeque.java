import java.util.*;

public class MyDeque<T>{
    private Object[]ary;
    private int start,end,size;

    @SuppressWarnings("unchecked")
    public MyDeque(){
	data = (T[]) new Object[10];
    }
    
    private void resize(){
	T[]ary2 = (T[])new Object[size * 2];
	int ctr = 0;
	for(int i = start;i < size;i++){
	    if(i + start < size){
		ary2[i] = data[i + start];
	    }else{
		ary2[i] = data[ctr];
		ctr++;
	    }
	}
	ary = ary2;
	start = 0;
	end = ctr - 1;
    }

    public void addFirst(T value){
	if(size == 0){
	    data[0] = value;
	    start = 0;
	    end = 0;
	}else{
	    if(size == data.length){
		grow();
	    }
	    if(start != 0){
		data[start - 1] = value;
		start--;
	    }else{
		data[data.length - 1] = value;
		start = data.length - 1;
	    }
	    size++;
	}
    }

    public void addLast(T value){
	if(size == 0){
	    data[0] = value;
	    start = 0;
	    end = 0;
	}else{
	    if(size == data.length){
		grow();
	    }
	    if(end != data.length - 1){
		data[end + 1] = value;
		end++;
	    }else{
		data[0] = value;
		end = 0;
	    }
	}
	size++;
    }

    

    public T getFirst(){
	if(size == 0){
	    throw new NoSuchElementException();
	}else{
	    return data[start];
	}
    }

    public T getLast(){
	if(size == 0){
	    throw new NoSuchElementException();
	}else{
	    return data[end];
	}
    }	
}
