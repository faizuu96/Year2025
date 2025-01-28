package jan2025;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrakets {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(s.hasNextLine()) {
            String input = s.nextLine();
            System.out.println(isBalanced(input));
        }
        s.close();
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch =='(' || ch =='{' || ch == '[') {
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top != '(') ||
                        (ch == '}' && top  != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

}
