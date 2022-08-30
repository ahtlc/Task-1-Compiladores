import java.util.*;

public class RPN {
    public int RPNalgorithm(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String operators = "-/+*";
        for(String token : tokens){
            if(!operators.contains(token)){
                stack.push(Integer.valueOf(token));
                continue;
            }
            int x = stack.pop();
            int y = stack.pop();
            if(token.equals("-")){
                stack.push(y - x);
            }
            else if(token.equals("+")){
                stack.push(y + x);
            }else if(token.equals("*")){
                stack.push(y * x);
            }else {
                stack.push(y / x);
            }
        }
        return stack.pop();
    }
}