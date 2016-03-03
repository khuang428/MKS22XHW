import java.util.*;
import java.io.*;
public class Bronze{
    Scanner in;
    int R,C,E,N;
    int[][]lake;
    
    public Bronze(){
	try{
	    in = new Scanner(new File("makelake.in"));
	}catch(FileNotFoundException e){
	    System.out.println("File doesn't exist");
	}
	R = in.nextInt();
	C = in.nextInt();
	E = in.nextInt();
	N = in.nextInt();
	lake = new int[R][C];
	for(int i = 0;i < R;i++){
	    for(int j = 0;j < C;j++){
		lake[i][j] = in.nextInt();
	    }
	}
    }

    public String solve(){
	for(int ctr = 0;ctr < N;ctr++){
	    int R_s = in.nextInt();
	    int C_s = in.nextInt();
	    int D_s = in.nextInt();
	    int max = lake[R_s - 1][C_s - 1];
	    for(int i = R_s - 1;i < R_s + 2;i++){
		for(int j = C_s - 1;j < C_s + 2;j++){
		    if(max < lake[i][j]){
			max = lake[i][j];
		    }
		}
	    }
	    max -= D_s;
	    for(int i = R_s - 1;i < R_s + 2;i++){
		for(int j = C_s - 1;j < C_s + 2;j++){
		    if(lake[i][j] > max){
			lake[i][j] = max;
		    }
		}
	    }
	}
	int sum = 0;
	for(int i = 0;i < R;i++){
	    for(int j = 0;j < C;j++){
		if(E - lake[i][j] > 0){
		    sum += E - lake[i][j];
		}
	    }
	}
	return sum * 72 * 72 + "7,Huang,Karen";    
    }

    public static void main(String[]args){
	Bronze b = new Bronze();
	System.out.println(b.solve());
    }
}
