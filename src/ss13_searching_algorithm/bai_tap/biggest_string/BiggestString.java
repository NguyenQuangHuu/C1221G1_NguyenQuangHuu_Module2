package ss13_searching_algorithm.bai_tap.biggest_string;

import java.util.LinkedList;
import java.util.Queue;

public class BiggestString {
    public static void main(String[] args) {
        String str = "Welcome";

        LinkedList<Integer> chars = new LinkedList<>();

        for (int i = 0; i <  str.length(); i++) {
            chars.add((int) str.charAt(i));
        }


        
        System.out.println(chars);
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0 ; i<str.length()-1;i++){
            if(str.charAt(i)<str.charAt(i+1)){
                queue.add(str.charAt(i));

            }
        }
        System.out.println(queue);
    }
}
