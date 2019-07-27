package buildTool;

import java.util.Stack;

public class RedundantBraces {

	public static void main(String[] args) {

		String st = "((a+b))";
		RedundantBraces r = new RedundantBraces();
		int result = r.braces(st);
		System.out.println(result);
	}

    public int braces(String A) {
        Stack<Character> s = new Stack<Character>();
        char ch[] = A.toCharArray();

        for(int i=0; i<ch.length; i++){
            if(ch[i]=='+' || ch[i]=='-' || ch[i]=='/' || ch[i]=='*' || ch[i]=='('){
                s.push(ch[i]);
            }
            if(ch[i]==')'){
                char c = s.pop();
                boolean flag= true;
                while(c != '('){
                    if(c=='+' || c=='-' || c=='*' || c=='/'){
                        flag = false;
                    }
                    c = s.pop();
                }
                
                if (flag) {
                    return 1;
                }
            }
        }
        
        return 0;
    }


}
