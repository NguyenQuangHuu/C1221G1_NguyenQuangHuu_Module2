package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class SpeakNumber {

    private  static String hangTram(int num,String value){
            switch (num){
                case 1: value+="One Hundred ";break;
                case 2: value+="Two Hundred ";break;
                case 3: value+="Three Hundred ";break;
                case 4: value+="Four Hundred ";break;
                case 5: value+="Five Hundred ";break;
                case 6: value+="Six Hundred ";break;
                case 7: value+="Seven Hundred ";break;
                case 8: value+="Eight Hundred ";break;
                case 9: value+="Nine Hundred ";break;
            }
            return value;
    }
    private static String hangChuc(int num,String value){
            switch (num){
                case 2: value += "Twenty ";break;
                case 3: value += "Thirty ";break;
                case 4: value += "Forty ";break;
                case 5: value += "Fifty ";break;
                case 6: value += "Sixty ";break;
                case 7: value += "Seventy ";break;
                case 8: value += "Eighty ";break;
                case 9: value += "Ninety ";break;
            }
            return value;
    }
    private static String hangDonVi(int num,String value){

        switch(num){
            case 1: value += "One";break;
            case 2: value += "Two";break;
            case 3: value += "Three";break;
            case 4: value += "Four";break;
            case 5: value += "Five";break;
            case 6: value += "Six";break;
            case 7: value += "Seven";break;
            case 8: value += "Eight";break;
            case 9: value += "Nine";break;
            case 10: value += "Ten";break;
            case 11: value += "Eleven";break;
            case 12: value += "Twelve";break;
            case 13: value += "Thirteen";break;
            case 14: value += "Fourteen";break;
            case 15: value += "Fifteen";break;
            case 16: value += "Sixteen";break;
            case 17: value += "Seventeen";break;
            case 18: value += "Eighteen";break;
            case 19: value += "Nineteen";break;
        }
        return value;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String s = "";
        if(number>0 && number <= 999){
            if(number > 99){
                int hundred = number / 100;
                int tensOf = number % 100;

                s += hangTram(hundred,s);
                if(tensOf != 0){
                    s+="And ";
                    if(tensOf > 19){
                        s+=hangChuc(tensOf/10,"");
                        s+=hangDonVi(tensOf%10,"");
                    }else{
                        s+= hangDonVi(tensOf,"");
                    }

                }
            }else{
                if(number>19){
                    if(number%10==0){
                        s=hangChuc(number/10,"");
                    }else{
                        s=hangChuc(number/10,"");
                        s+=hangDonVi(number%10,"");
                    }
                }else{
                    s=hangDonVi(number,"");
                }
            }
        }else if(number==0){
            s+="Zero";
        }else{
            s+="Out of Memory";
        }
        System.out.println(s);
    }
}