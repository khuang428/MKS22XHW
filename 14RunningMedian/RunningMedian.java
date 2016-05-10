import java.util.*;
public class RunningMedian{
    private MyHeap min,max;
    private int minSize,maxSize;

    public RunningMedian(){
	min = new MyHeap(false);
	max = new MyHeap();
    }

    public double getMedian(){
	if(minSize == 0 && maxSize == 0){
	    throw new NoSuchElementException();
	}
	return 0;
    }

    public void add(Integer x){
	if(x < getMedian()){
	    min.add(x);
	    minSize++;
	}else{
	    max.add(x);
	    maxSize++;
	}
	if(minSize + 1 > maxSize){
	    
	}
    }
}
