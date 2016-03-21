import java.util.*;

public class Quick{
    
    private static void swap(int[]data,int a, int b){
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
    }

    private static int partitionOld(int[]data,int left, int right){
	int part = left +(int)(Math.random() * (right - left + 1));
	int start = left + 1, end = right;
	while(start < end){
	    if(data[start] < data[left]){
		swap(data,start,end);
		end--;
	    }else{
		start++;
	    }
	}
	if(data[start] > data[left]){
	    swap(data,left,start - 1);
	    return start - 1;
	}else{
	    swap(data,left,start);
	    return start;
	}
    }

    private static int quickselectOld(int[]data, int k, int left, int right){
	if(left == right){
	    return data[left];
	}
	int index = partitionOld(data,left,right);
	if(index == k){
	    return data[k];
	}
	if(index < k){
	    return quickselectOld(data,k,index + 1,right);
	}
	return quickselectOld(data,k,left,index - 1);
    }

    public static int quickselectOld(int[]data, int k){
	return quickselectOld(data,k,0,data.length - 1);
    }

    public static String name(){
	return "7,Huang,Karen";
    }

    private static void quickSortOld(int[]data,int left,int right){
	if(left != right){
	    int index = partitionOld(data,left,right);
	    quickSortOld(data,index + 1,right);
	    quickSortOld(data,left,index - 1);
	}
    }

    public static void quickSortOld(int[]data){
	quickSortOld(data,0,data.length - 1);
    }

    
    private static int[] partition(int[]data,int left,int right){
	int index =(int)((right - left + 1) * Math.random() + left);
	int pivot = data[index];
	swap(data,index,right);
	int ctr = left, ctr2 = left;
	while(left < right){
	    if(data[left] < pivot){
		swap(data,ctr,left);
		ctr++;
	    }
	    left++;
	}
	int[]ary = new int[2];
	ary[0] = ctr;
	while(ctr < right){
	    if(data[ctr] == pivot){
		swap(data,ctr,ctr2);
		ctr2++;
	    }
	    ctr++;
	}
	ary[1] = ctr2 - 1;
	return ary;
    }

    private static void quickSort(int[]data,int left,int right){
	if(right - left >= 1){
	     int[]index = partition(data,left,right);
	     quickSort(data,index[1] + 1,right);
       	     quickSort(data,left,index[0] - 1);
	}
    }

    public static void quickSort(int[]data){
	quickSort(data,0,data.length - 1);
    }

}
