import java.util.*;

public class MyDeque<T>{
    private Object[]ary;
    private int start,end,size;

    public MyDeque(){
	size = 0;
	ary = new Object[5];
    }
    
    private void resize(){
	Object[]ary2 = new Object[size * 2];
	int ctr = 0;
	for(int i = start;i < size;i++){
	    ary2[ctr] = ary[i];
	    ctr++;
	}
	for(int i = 0;i != start;i++){
	    ary2[ctr] = ary[i];
	    ctr++;
	}
	ary = ary2;
	start = 0;
	end = ctr - 1;
    }

    public void addFirst(T value){
	
    }

    public void addLast(T value){

    }
}
