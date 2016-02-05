public class Recursion{
    public String name(){
	return "Huang,Karen";
    }
    private double betterGuess(double n, double guess){
	if(Math.abs(guess * guess - n) < .000000001){
	    return guess;
	}
	return betterGuess(n , (n / guess + guess) / 2);
    }
    public double sqrt(double n){
	if(n < 0){
	    throw new IllegalArgumentException();
	}
	return betterGuess(n , 1);
    }
}
