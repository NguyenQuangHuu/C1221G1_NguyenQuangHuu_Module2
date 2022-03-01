package ss11_stack_queue.bai_tap.reverse_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int[] array = {1,2,4,5,3,6,7};
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for(int i = 0 ; i < array.length;i++){
//            while(!stack.isEmpty()){
//                array[i] = stack.pop();
//            }
            array[i] =stack.pop();
        }

        System.out.println(Arrays.toString(array));

        Stack<Character> wStack = new Stack<>();

        String str ="test string";
        char[] mWord = new char[str.length()];
        for(int i = 0 ; i<mWord.length;i++){
            mWord[i] = str.charAt(i);
            wStack.push(mWord[i]);
        }
        String outp = "";
        for(int i = 0 ; i < mWord.length;i++){
             outp += wStack.pop();
        }
//        while(!wStack.isEmpty()){
//            mWord+=wStack.pop();
//        }
//        System.out.println(wStack);
//        System.out.println(mWord);

        System.out.println(outp);
    }
}
