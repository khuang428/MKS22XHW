public class QueenBoard{
    private int[][]board;
    
    public QueenBoard(int size){
	board = new int[size][size];
    }

    /**
     *precondition: board is filled with 0's only.
     *postcondition: 
     *-return false, and board is still filled
     *with 0's for a board that cannot be solved.
     *-return true, and board is filled with the 
     *final configuration of the board after adding 
     *all n queens.
     */
    public boolean solve(){
	return solveH(0);
    }

    /**
     *Helper method for solve. 
     */
    private boolean solveH(int col){
	if(col >= board.length){
	    return true;
	}
	for(int i = 0;i < board.length;i++){
	    if(addQueen(i, col)){
		return solveH(col++);
	    }
	    if(board[i][col] == 1){
		removeQueen(i, col);
	    }
	}
	if(col == 0){
	    return false;
	}else{
	    return solveH(col--);
	}
    }

    public void printSolution(){
	/**Print the board like toString, except
	   all negative numbers and 0's are replaced with '_'
	   and all 1's are replaced with 'Q'
	 */
	for(int i = 0;i < board.length;i++){
	    for(int j = 0;j < board[i].length;j++){
		if(board[i][j] == 1){
		    System.out.print('Q');
		}else{
		    System.out.print('_');
		}
	    }
	    System.out.println();
	}
    }

    /********Do Not Edit Below This Line**********************************/

    private boolean addQueen(int row, int col){
	if(board[row][col] != 0){
	    return false;
	}
	board[row][col] = 1;
	int offset = 1;
	while(col+offset < board[row].length){
	    board[row][col+offset]--;
	    if(row - offset >= 0){
		board[row-offset][col+offset]--;
	    }
	    if(row + offset < board.length){
		board[row+offset][col+offset]--;
	    }
	    offset++;
	}
	return true;
    }

    private boolean removeQueen(int row, int col){
	if(board[row][col] != 1){
	    return false;
	}
	board[row][col] = 0;
	int offset = 1;
	while(col+offset < board[row].length){
	    board[row][col+offset]++;
	    if(row - offset >= 0){
		board[row-offset][col+offset]++;
	    }
	    if(row + offset < board.length){
		board[row+offset][col+offset]++;
	    }
	    offset++;
	}
	return true;
    }

    public String  toString(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		ans+= board[r][c]+"\t";
	    }
	    ans+="\n";
	}
	return ans;
    }
    /*
    public static void main(String[]args){
	QueenBoard b = new QueenBoard(5);
        System.out.println(b);
	b.addQueen(3,0);
	b.addQueen(0,1);
        System.out.println(b);
	b.removeQueen(3,0);
        System.out.println(b);
    }
    */
    
}