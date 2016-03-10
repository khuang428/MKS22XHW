public class Quick{
    
    private static void swap(int[]data,int a, int b){
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
    }

    private static int partition(int[]data,int left, int right){
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

    private static int quickselect(int[]data, int k, int left, int right){
	if(left == right){
	    return data[left];
	}
	int index = partition(data,left,right);
	if(index == k){
	    return data[k];
	}
	if(index < k){
	    return quickselect(data,k,index + 1,right);
	}
	return quickselect(data,k,left,index - 1);
    }

    public static int quickselect(int[]data, int k){
	return quickselect(data,k,0,data.length - 1);
    }

    public static String name(){
	return "7,Huang,Karen";
    }

    private static void quickSort(int[]data,int left,int right){
	if(left != right){
	    int index = partition(data,left,right);
	    quickSort(data,index + 1,right);
	    quickSort(data,left,index - 1);
	}
    }

    public static void quickSort(int[]data){
	quickSort(data,0,data.length - 1);
    }
}
