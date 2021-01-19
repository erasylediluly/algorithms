import java.util.*;
public class DuplicateParatheses {
	public static void main(String[] args){
		String s1 = "((x+y))+z";
		String s2 = "(x+y)";
		String s3 = "((x+y) + ((z))";
		System.out.println(duplicateParantheses(s1));
		System.out.println(duplicateParantheses(s2));
		System.out.println(duplicateParantheses(s3));
	}
	public static boolean duplicateParantheses(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ')'){
				char top = stack.pop();
				if(top == '('){
					return true;
				}
				while(top != '('){
					top = stack.pop();
				}
			}
			else{
				stack.push(s.charAt(i));
			}
		}
		return false;
	}
}