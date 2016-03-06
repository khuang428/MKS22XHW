import java.util.*;
import java.io.*;

public class Silver{
    int row,col,moves,rowS,colS,rowE,colE;
    int[][]field;
    
    public Silver(){
	try{
	    Scanner in = new Scanner(new File("ctravel.in"));
	    row = in.nextInt();
	    col = in.nextInt();
	    moves = in.nextInt();
	    field = new int[row][col];
	    String s = "";
	    in.nextLine();
	    for(int i = 0;i < row;i++){
		s+=in.nextLine();
	    }
	    for(int i = 0;i < row;i++){
		for(int j = 0;j < col;j++){
		    if(s.charAt(i * col + j) == '.'){
			field[i][j] = 0;
		    }else{
			field[i][j] = -1;
		    }
		}
	    }
	    rowS = in.nextInt() - 1;
	    colS = in.nextInt() - 1;
	    field[rowS][colS] = 1;
	    rowE = in.nextInt() - 1;
	    colE = in.nextInt() - 1;
	}catch(FileNotFoundException e){
	    System.out.println("File doesn't exist");
	}
    }
    
    public void solve(){
	int[][]ary1 = new int[row][col],ary2;
	for(int ctr = 0;ctr < moves;ctr++){
	    for(int i = 0;i < row;i++){
		for(int j = 0;j < col;j++){
		    if(field[i][j] != -1){
			ary1[i][j] = 0;
			if(i + 1 < row && field[i + 1][j] >= 0){
			    ary1[i][j] += field[i + 1][j];
			}
			if(i - 1 >= 0 && field[i - 1][j] >= 0){
			    ary1[i][j] += field[i - 1][j];
			}
			if(j + 1 < col && field[i][j + 1] >= 0){
			    ary1[i][j] += field[i][j + 1];
			}
			if(j - 1 >= col && field[i][j - 1] >= 0){
			    ary1[i][j] += field[i][j - 1];
			}
		    }else{
			ary1[i][j] = -1;
		    }
		}
	    }
	    ary2 = field;
	    field = ary1;
	    ary1 = ary2;
	}
    }
    
    public void print(){
	System.out.println(field[rowE][colE] + ",7,Huang,Karen");
    }
    public static void main(String[]args){
	Silver s = new Silver();
	s.solve();
	s.print();
    }
    
}
