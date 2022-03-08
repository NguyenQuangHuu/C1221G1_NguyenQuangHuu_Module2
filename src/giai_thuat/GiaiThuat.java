package giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GiaiThuat {
    public static void main(String[] args) {
        solution("HelloWorld");

    }

    static void solution(String arg1) {

        String[] listChar = new String[arg1.length()];
        for(int i = 0; i< arg1.length();i++){
            listChar[i] = String.valueOf(arg1.charAt(i));
        }
        System.out.println(Arrays.toString(listChar));
        for(int i = 0; i<listChar.length;i++){
            if(listChar[0].equals(listChar[0].toUpperCase())){
                listChar[0] = listChar[i].toLowerCase();
            }else{
                if(listChar[i].equals(listChar[i].toUpperCase())){
                    listChar[i] = " "+listChar[i].toLowerCase();
                }
            }
        }

        StringBuilder text = new StringBuilder();
        for (String s:
             listChar) {
            text.append(s);
        }

        System.out.println(text);
//
//        String text = "";
//        for (int i = 0; i < list.size(); i++) {
//
//            text += list.get(i);
//        }

    }

}
