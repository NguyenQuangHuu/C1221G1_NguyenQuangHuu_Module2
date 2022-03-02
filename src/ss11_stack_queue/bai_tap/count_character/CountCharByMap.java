package ss11_stack_queue.bai_tap.count_character;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountCharByMap {
    public static void main(String[] args) {
        String str = "abbbddssas  ddd";

        str = str.toLowerCase();

        ArrayList<Character> arrayList = new ArrayList<>();

        Map<Character,Integer> hashMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(str.charAt(i));
        }
        for (int i = 0 ; i<str.length();i++){

            if(!hashMap.containsKey(arrayList.get(i))) {

                hashMap.put(arrayList.get(i), 1);
            }else{
                hashMap.put(arrayList.get(i),hashMap.get(arrayList.get(i))+1);
            }
        }

        System.out.println(hashMap);


    }
}
