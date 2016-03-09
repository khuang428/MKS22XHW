public class Sorts{
    public static void selection(int[]nums){
	for(int ctr=0;ctr<nums.length;ctr++){
	    int min=nums[ctr];
	    int index=ctr;
	    int i;
	    for(i=ctr+1;i<nums.length;i++){
		if(nums[i]<min){
		    min=nums[i];
		    index=i;
		}
	    }
	    nums[i]=nums[ctr];
	    nums[ctr]=min;
	}
    }

    public static void bubble(int[]nums){
	int num;
	for(int ctr=nums.length;ctr>0;ctr--){
	    for(int i=0;i<nums.length-1;i++){
		if(nums[i]>nums[i+1]){
		    num=nums[i];
		    nums[i]=nums[i+1];
		    nums[i+1]=num;
		}
	    }
	}
    }

    public void mergesort(int[]data){
	int[]ary = mergeH(data);
	for(int i = 0;i < data.length;i++){
	    data[i] = ary[i];
	}
    }

    public int[]mergeH(int[]data){
	if(data.length == 1){
	    return data;
	}
	int mid = data.length / 2;
	int[]m1 = new int[mid];
	int[]m2 = new int[data.length - mid];
	for(int i = 0;i < mid;i++){
	    m1[i] = data[i];
	}
	for(int i = 0;i < m2.length;i++){
	    m2[i] = data[i+mid];
	}
	return merge(mergeH(m1),mergeH(m2));
    }

    public int[]merge(int[]m1,int[]m2){
	int[]ary = new int[m1.length+m2.length];
	int i = 0, j = 0;
	while(i < m1.length || j < m2.length){
	    if(i == m1.length){
		ary[i + j] = m2[j];
		j++;
	    }else if(j == m2.length){
		ary[i + j] = m1[i];
		i++;
	    }else if(m1[i] < m2[j]){
		ary[i + j] = m1[i];
		i++;
	    }else{
		ary[i + j] = m2[j];
		j++;
	    }
	}
	return ary;
    }
}
