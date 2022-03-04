package ss13_searching_algorithm.bai_tap.biggest_string;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BiggestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();

        LinkedList<Character> chars = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {

            LinkedList<Character> temp = new LinkedList<>();
            temp.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > temp.getLast()) {
                    temp.add(str.charAt(j));
                }

            }
            if (temp.size() > chars.size()) {
                chars.clear();
                chars.addAll(temp);
            }

        }

        chars.forEach(System.out::print);
    }
}
