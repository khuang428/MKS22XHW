import java.util.*;

public class RunningMedian{
    private MyHeap<Integer> min,max;
    private int minSize,maxSize;

    public RunningMedian(){
	min = new MyHeap<Integer>(false);
	max = new MyHeap<Integer>();
    }

    public double getMedian(){
	if(minSize == 0 && maxSize == 0){
	    throw new NoSuchElementException();
	}
	if(minSize == 0 || maxSize > minSize){
	    return (double)max.peek();
	}else if(minSize > maxSize){
	    return(double)min.peek();
	}
	return (double)((min.peek() + max.peek()) / 2);
    }

    public void add(Integer x){
	if(minSize == 0 && maxSize == 0){
	    max.add(x);
	    maxSize++;
	}
	if(x < getMedian()){
	    min.add(x);
	    minSize++;
	}else{
	    max.add(x);
	    maxSize++;
	}
	if(minSize + 1 > maxSize){
	    max.add(min.delete());
	    maxSize++;
	    minSize--;
	}
	if(maxSize + 1 > minSize){
	    min.add(max.delete());
	    minSize++;
	    maxSize--;
	}
    }
}
