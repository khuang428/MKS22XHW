public class Quick{
    private static int partition(int[]data,int left, int right){
	int ctr = 0;
	int[]ary = new int[data.length];
	int part = left +(int)(Math.random() * (right - left));
	for(int i = 0;i < data.length;i++){
	    if(data[i] < data[part]){
		ary[ctr] = data[i];
		ctr++;
	    }
	}
	int index = ctr;
	for(int i = 0;i < data.length;i++){
	    if(data[i] == data[part]){
		ary[ctr] = data[i];
		ctr++;
	    }
	}
	for(int i = 0;i < data.length;i++){
	    if(data[i] > data[part] ){
		ary[ctr] = data[i];
		ctr++;
	    }
	}
	data = ary;
	return index;
    }

    private static int quickselect(int[]data, int k, int left, int right){
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
}
