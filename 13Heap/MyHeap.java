import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>{
   private int size;
   private T[] data;

   public MyHeap(){
       data = (T[])new Comparable[2];
   }
   public MyHeap(T[] array){
       data = array; 
       heapify();
   }
   private void pushDown(int k){
       
   }
   private void pushUp(int k){
	   T temp = data[k];
	   data[k] = data[k/2];
	   data[k/2] = temp;
   }
   private void heapify(){
       
   }
   public T delete(){
       return null;
   }
   public void add(T x){
       if(size == data.length){
	   doubleSize();
       }
       if(size == 0){
	   data[1] = x;
       }else{
	   data[size + 1] = x;
       }
       size++;
   }
   private void doubleSize(){
       T[]ary = (T[])new Comparable[size * 2];
       for(int i = 0;i < size;i++){
	   ary[i] = data[i];
       }
       data = ary;
   }
   public String toString(){
       return "";
   }

   //do this last
   public MyHeap(boolean isMax){}
   public MyHeap(T[] array, boolean isMax){}
}
