package ss11_stack_queue.bai_tap.symbol_check;

import java.util.Stack;

public class SymbolCheck {
    public static void main(String[] args) {
            Stack symStack = new Stack<>();
            Stack left = new Stack<>();
            String str = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
            boolean flag = true;
            for(int i = 0; i < str.length() ; i++){

                if(str.charAt(i)=='('){
                    symStack.push(str.charAt(i));
                }

                if(str.charAt(i) == ')'){
                    if(symStack.isEmpty()){
                        flag = false;
                    }else{
                        left.push(str.charAt(i));
                    }
                }
            }
        System.out.println(symStack);
        System.out.println(flag);
        System.out.println(left);
        if(flag && (symStack.size() == left.size())){
            System.out.println("WELL");
        }else{
            System.out.println("NOT WELL");
        }
    }
}
