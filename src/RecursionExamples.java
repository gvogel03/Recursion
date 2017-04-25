//This is not a guide on how to use recursion, these are just examples to help further your understanding
public class RecursionExamples {
	//Returns a string that has been flipped around
	public String printBackwards(String n){
		String fin = "";
		if(n.length() == 0){
			return fin;
		}
		else{
			return n.substring(n.length()-1) + printBackwards(n.substring(0, n.length()-1));
		}
		
	}
	//adds all the numbers less than or equal to int n
	public int addNums(int n){
		if(n == 0){
			return n;
		}
		else{
			return n + addNums(n-1);
		}
	}
	//returns nth element in the fibonacci sequence
	public int fibonacci(int n){
		if(n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		else{
			return fibonacci(n- 1) + fibonacci(n - 2);
		}
		
	}
	// returns base to the nth power
	public int powerN(int base, int n) {
		  if(n == 0){
		    return 1;
		  }
		  else if(n == 1){
		    return base;
		  }
		  else{
		    return base * powerN(base, n-1);
		  }
		}
	public int occurences(String n, char target){
		if(n.length() == 0)
			return 0;
		if(n.charAt(0) == target)
			return 1 + occurences(n.substring(1), target);
		return occurences(n.substring(1), target);
	}
	public static void main(String[]args){
		RecursionExamples r = new RecursionExamples();
		System.out.println("printBackwards: " + r.printBackwards("hello world"));
		System.out.println("addNums: " + r.addNums(10));
		System.out.println("fibonacci: " + r.fibonacci(7));
		System.out.println("powerN: " + r.powerN(2, 4));
		System.out.println("occurences: " + r.occurences("aabcadc", 'c'));
	}

}
