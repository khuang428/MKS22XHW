public class KnightBoard{
    private int[][]board;
    private int size;

    public KnightBoard(int s){
	board = new int[s][s];
	size = s;
	board[0][0] = 1;
    }

    private boolean solveH(){
	return false;
    }

    public boolean solve(){
	return false;

    public void printSolution(){
	for(int i = 0;i < size;i++){
	    for(int j = 0;j < size;j++){
		System.out.print(board[i][j]);
	    }
	    System.out.println();
	}
    }
}
