public class Queens{
    public int size = 1;
    public int[][]board;
    
    public Queens(int n){
	size = n;
	board = new int[n][n];
    }

    public String toString(){
	String retStr = "";
	for(int i = 0;i < size;i++){
	    for(int j = 0;j < size;j++){
		retStr += board[i][j];
	    }
	    retStr += "\n";
	}
	return retStr;
    }

    public void removeHelper(int a, int b){
	for(int i = b++;i < size;i++){
	    board[a][i] += 1;
	}
	for(int i = a++;i < size;i++){
	    for(int j = b++;j < size;j++){
		board[i][j] += 1;
	    }
	}
	for(int i = a--;i < size;i--){
	    for(int j = b++;j < size;j++){
		board[i][j] += 1;
	    }
	}
    }

    public void addHelper(int a, int b){
	for(int i = b++;i < size;i++){
	    board[a][i] -= 1;
	}
	for(int i = a++;i < size;i++){
	    for(int j = b++;j < size;j++){
		board[i][j] -= 1;
	    }
	}
	for(int i = a--;i < size;i--){
	    for(int j = b++;j < size;j++){
		board[i][j] -= 1;
	    }
	}
    }

    public void addQueen(int a, int b){
	board[a][b] = 1;
	addHelper(a, b);
    }

    public void removeQueen(int a,int b){
	board[a][b] = 0;
	removeHelper(a, b);
    }
}
