public class BetterMaze{
    private char[][] maze;
    private int[] solution;
    private int startRow,startCol;
    private Frontier<Node> placesToGo;
    private boolean animate;//default to false

    private class Node{
	private int row,col;
	private Node prev;

	public Node(int r, int c, Node prev){
	    row = r;
	    col = c;
	    this.prev = prev;
	}

	public Node getPrev(){
	    return prev;
	}

	public int getRow(){
	    return row;
	}

	public int getCol(){
	    return col;
	}
    }

   /**return a COPY of solution.
     *This should be : [x1,y1,x2,y2,x3,y3...]
     *the coordinates of the solution from start to end.
     *Precondition : one of the solveXXX methods has already been 
     * called (solveBFS OR solveDFS OR solveAStar)
     *(otherwise an empty array is returned)
     *Postcondition:  the correct solution is in the returned array
    **/
    public int[] solutionCoordinates(){
        /** IMPLEMENT THIS **/      
    }    

    /**initialize the frontier as a queue and call solve
    **/
    public boolean solveBFS(){  
        placesToGo = new FrontierQueue<Node>();
	return solve();
    }   

   /**initialize the frontier as a stack and call solve
    **/ 
    public boolean solveDFS(){  
        placesToGo = new FrontierStack<Node>();
	return solve();
    }    

   /**Search for the end of the maze using the frontier. 
      Keep going until you find a solution or run out of elements on the frontier.
    **/
    public boolean solve(){  
        Node current = new Node(startRow,startCol,null);
	return false;
    }    
     
   /**mutator for the animate variable  **/
    public void setAnimate(boolean b){
	animate = b;
    }    
}
