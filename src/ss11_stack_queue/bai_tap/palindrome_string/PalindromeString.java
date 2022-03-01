package ss11_stack_queue.bai_tap.palindrome_string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        Stack<Character> characters = new Stack<>();
        String str = "1Able was I ere I saw Elba";

        str = str.toLowerCase();
        System.out.println(str);
        Queue<Character> characterQueue = new LinkedList<>();
        for(int i = 0 ; i < str.length();i++){
            characterQueue.add(str.charAt(i));
            characters.push(str.charAt(i));
        }
        while(!characters.isEmpty()) {
            if (characters.peek() == characterQueue.peek()) {
                characterQueue.poll();
                characters.pop();
            }else{
                break;
            }
        }


        System.out.println(characterQueue);
        System.out.println(characters.isEmpty());

        if(characters.isEmpty() && characterQueue.isEmpty()){
            System.out.println("Đây là dãy chuỗi có palindrome");
        }else{
            System.out.println("Đây không phải là dãy chuỗi có palindrome");
        }
    }
}
