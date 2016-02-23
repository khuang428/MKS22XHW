public class KnightBoard{
    private int[][]board;
    private int ctr = 1;

    public KnightBoard(int row,int col){
        board = new int[row + 4][col + 4];
	for(int i = 0;i < row + 4;i++){
	    board[i][0] = -1;
	    board[i][1] = -1;
	    board[i][col + 2] = -1;
	    board[i][col + 3] = -1;
	}
	for(int j = 2;j < col + 2;j++){
	    board[0][j] = -1;
	    board[1][j] = -1;
	    board[row + 2][j] = -1;
	    board[row + 3][j] = -1;
	}
    }

    private boolean solveH(int row, int col){
	if(board[row][col] != 0){
	    return false;
	}
	if(board[row][col] == board.length * board[0].length){
	    return true;
	}
	board[row][col] = ctr;
	ctr++;
	if(solveH(row + 1,col + 2)){
	    return true;
	}else if(solveH(row + 1,col - 2)){
	    return true;
	}else if(solveH(row + 2,col + 1)){
	    return true;
	}else if(solveH(row + 2,col - 1)){
	    return true;
	}else if(solveH(row - 1,col + 2)){
	    return true;
	}else if(solveH(row - 1,col - 2)){
	    return true;
	}else if(solveH(row - 2,col + 1)){
	    return true;
	}else if(solveH(row - 2,col - 1)){
	    return true;
	}else{
	    ctr--;
	    board[row][col] = 0;
	    return false;
	}
    }
    public boolean solve(){
	return solveH(2,2);
    }

    public void printSolution(){
	for(int i = 0;i < board.length;i++){
	    for(int j = 0;j < board[0].length;j++){
		if(board[i][j] > 0){
		    if(board.length * board[0].length >= 10 
		       && board[i][j] < 10){
			System.out.print("_" + board[i][j]+" ");
		    }else{
			System.out.print(board[i][j] + " ");
		    }
		}
	    }
	    System.out.println();
	}
    }
}
