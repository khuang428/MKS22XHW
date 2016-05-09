import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>{
   private int size;
   private T[] data;
   private boolean isMax;

   public MyHeap(){
       isMax = true;
       data = (T[])new Comparable[2];
   }
   public MyHeap(T[] array){
       isMax = true;
       size = array.length;
       data = (T[])new Comparable[size + 1];
       for(int i = 0;i < array.length;i++){
	   data[i+1] = array[i];
       }
       heapify();
   }
   private void pushDown(int k){
       T temp = data[k];
       
       
   }
   private void pushUp(int k){
	   T temp = data[k];
	   data[k] = data[k/2];
	   data[k/2] = temp;
   }
   private void heapify(){
       for(int i = size/2;i >0;i--){
	   pushDown(i);
       }
   }
   public T delete(){
       if(size == 0){
	   return null;
       }
       T temp = data[1];
       data[1] = data[size - 1];
       pushDown(1);
       size--;
       return temp;
   }
   public void add(T x){
       if(size == data.length){
	   doubleSize();
       }
       if(size == 0){
	   data[1] = x;
       }else{
	   data[size + 1] = x;
	   pushUp(size + 1);
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
       String retStr = "";
       for(int i = 0;i < data.length;i++){
	   retStr += data[i] + ",";
       }
       retStr = retStr.substring(0,retStr.length() - 1) + "]";
       return retStr;
   }

   //do this last
   public MyHeap(boolean isMax){
       this.isMax = isMax;
       data = (T[])new Comparable[2];
   }
   public MyHeap(T[] array, boolean isMax){
       this.isMax = isMax;
       size = array.length;
       data = (T[])new Comparable[size + 1];
       for(int i = 0;i < array.length;i++){
	   data[i + 1] = array[i];
       }
       heapify();
   }
}
