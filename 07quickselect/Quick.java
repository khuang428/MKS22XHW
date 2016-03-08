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
	return part;
    }
	
}
