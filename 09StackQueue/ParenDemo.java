public class ParenDemo{
    public static boolean isMatching(String s){
	MyStack<char> open;
	for(i = 0;i < s.length();i++){
	    if(isOpen(s.charAt(i))){
		open.push(s.charAt(i));
	    }
	    if(isClose(s.charAt(i)) && !matches(open,s.charAt(i))){
		return false;
	    }
	}
	if(open.isEmpty()){
	    return true;
	}
	return false;
    }

    private static boolean isOpen(char c){
	if(c == "{" || c == "[" || c == "(" || c == "<"){
	    return true;
	}
	return false;
    }

    private static boolean isClose(char c){
	if(c == "}" || c == "]" || c == ")" || c == ">"){
	    return true;
	}
	return false;
    }

    private static boolean matches(MyStack<char> stack,char c){
	if(stack.pop() == "{"){
	    return c == "}";
	}
	if(stack.pop() == "["){
	    return c == "]";
	}
	if(stack.pop() == "("){
	    return c == ")";
	}
	if(stack.pop() == "<"){
	    return c == ">";
	}
    }
    public static void main(String[]args){
	String input = "()()(([[]]))";
	if(args.length > 0){
	    input = args[0];
	    System.out.println(isMatching(input)); 
	}else{
	    System.out.println("Usage:"); 
	    System.out.println("java ParenDemo \"text\""); 
	}
 
    }
}
