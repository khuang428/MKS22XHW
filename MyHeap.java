import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>{
   private int size;
   private T[] data;

   public MyHeap(){
   }
   public MyHeap(T[] array){
       data = array;
       heapify();
   }
   private void pushDown(int k){
   }
   private void pushUp(int k){
   }
   private void heapify(){
   }
   public T delete(){
       return null;
   }
   public void add(T x){
       if(size == 0){
	   data[0] = x;
       }
       
       size++;
   }
   private void doubleSize(){
       size *= 2;
   }
   public String toString(){
       return "";
   }

   //do this last
   public MyHeap(boolean isMax){}
   public MyHeap(T[] array, boolean isMax){}
}
