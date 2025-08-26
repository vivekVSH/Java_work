import java.util.Stack;
import java.util.*;

public class arrays {
    public static boolean balanceParathesic(String str){
        Stack<Character> st = new Stack<>();
        char[] car = str.toCharArray();
        for(char c : car){
            if(c == '{' || c == '(' || c == '['){
                st.push(c);
            }else if(c == '}' || c == ')' || c == ']'){
                st.pop();
            }
        }

        if(st.isEmpty()){
            return true;
        }

        return false;
    }
    public static void main(String[] args){
        String str = "{([]}";
        System.out.println(balanceParathesic(str));
    }
}
