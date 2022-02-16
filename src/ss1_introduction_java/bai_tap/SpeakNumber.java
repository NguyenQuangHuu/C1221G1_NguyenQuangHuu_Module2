package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class SpeakNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        short weight = sc.nextShort();
        String s = "";
        boolean checkHundreds = weight / 100 > 0;
        boolean checkTens = weight / 10 > 0;

        if(checkHundreds) {
            short hundred = (short) (weight / 100);
            switch (hundred) {
                case 1:
                    s += "one hundred ";
                    break;
                case 2:
                    s += "two hundred ";
                    break;
                case 3:
                    s += "three hundred ";
                    break;
                case 4:
                    s += "four hundred ";
                    break;
                case 5:
                    s += "five hundred ";
                    break;
                case 6:
                    s += "six hundred ";
                    break;
                case 7:
                    s += "seven hundred ";
                    break;
                case 8:
                    s += "eight hundred ";
                    break;
                case 9:
                    s += "nine hundred ";
                    break;
            }
        }else
        if(checkTens){
            s+="and ";
            short tens = (short) (weight % 100);
            short tensNum = (short) (tens/10);
            short num2 = (short) (tens%10);
            switch (tensNum){
                case 0: switch (num2){
                    case 1: s+="ones";break;
                    case 2: s+="twos";break;
                    case 3: s+="threes";break;
                    case 4: s+="fours";break;
                    case 5: s+="fives";break;
                    case 6: s+="six";break;
                    case 7: s+="sevens";break;
                    case 8: s+="eight";break;
                    case 9: s+="nine";break;
                };break;
                case 1:
                    switch (num2){
                        case 0: s+= "ten";break;
                        case 1: s+= "eleven";break;
                        case 2: s+= "twelve";break;
                        case 3: s+= "thirteen";break;
                        case 4: s+= "fourteen";break;
                        case 5: s+= "fifteen";break;
                        case 6: s+= "sixteen";break;
                        case 7: s+= "seventeen";break;
                        case 8: s+= "eighteen";break;
                        case 9: s+= "nineteen";break;
                    };break;
                case 2: s+= "twenty ";
                    switch (num2){
                        case 1: s+="ones";break;
                        case 2: s+="twos";break;
                        case 3: s+="threes";break;
                        case 4: s+="fours";break;
                        case 5: s+="fives";break;
                        case 6: s+="six";break;
                        case 7: s+="sevens";break;
                        case 8: s+="eight";break;
                        case 9: s+="nine";break;
                    }
                    break;
                case 3: s+= "thirty ";
                    switch (num2){
                        case 1: s+="ones";break;
                        case 2: s+="twos";break;
                        case 3: s+="threes";break;
                        case 4: s+="fours";break;
                        case 5: s+="fives";break;
                        case 6: s+="six";break;
                        case 7: s+="sevens";break;
                        case 8: s+="eight";break;
                        case 9: s+="nine";break;
                    }
                    break;
                case 4: s+= "forty ";
                    switch (num2){
                        case 1: s+="ones";break;
                        case 2: s+="twos";break;
                        case 3: s+="threes";break;
                        case 4: s+="fours";break;
                        case 5: s+="fives";break;
                        case 6: s+="six";break;
                        case 7: s+="sevens";break;
                        case 8: s+="eight";break;
                        case 9: s+="nine";break;
                    }
                    break;
                case 5: s+= "fifty ";
                    switch (num2){
                        case 1: s+="ones";break;
                        case 2: s+="twos";break;
                        case 3: s+="threes";break;
                        case 4: s+="fours";break;
                        case 5: s+="fives";break;
                        case 6: s+="six";break;
                        case 7: s+="sevens";break;
                        case 8: s+="eight";break;
                        case 9: s+="nine";break;
                    };
                    break;
                case 6: s+= "sixty ";
                    switch (num2){
                        case 1: s+="ones";break;
                        case 2: s+="twos";break;
                        case 3: s+="threes";break;
                        case 4: s+="fours";break;
                        case 5: s+="fives";break;
                        case 6: s+="six";break;
                        case 7: s+="sevens";break;
                        case 8: s+="eight";break;
                        case 9: s+="nine";break;
                    }
                    break;
                case 7: s+= "seventy ";
                    switch (num2){
                        case 1: s+="ones";break;
                        case 2: s+="twos";break;
                        case 3: s+="threes";break;
                        case 4: s+="fours";break;
                        case 5: s+="fives";break;
                        case 6: s+="six";break;
                        case 7: s+="sevens";break;
                        case 8: s+="eight";break;
                        case 9: s+="nine";break;
                    };
                    break;
                case 8: s+= "eighty ";
                    switch (num2){
                        case 1: s+="ones";break;
                        case 2: s+="twos";break;
                        case 3: s+="threes";break;
                        case 4: s+="fours";break;
                        case 5: s+="fives";break;
                        case 6: s+="six";break;
                        case 7: s+="sevens";break;
                        case 8: s+="eight";break;
                        case 9: s+="nine";break;
                    };
                    break;
                case 9: s+= "ninety ";
                    switch (num2){
                        case 1: s+="ones";break;
                        case 2: s+="twos";break;
                        case 3: s+="threes";break;
                        case 4: s+="fours";break;
                        case 5: s+="fives";break;
                        case 6: s+="six";break;
                        case 7: s+="sevens";break;
                        case 8: s+="eight";break;
                        case 9: s+="nine";break;
                    }
                    break;
            }
        }



//        if(weight>99){
//
//            short over = (short)(weight%100);
//
//            if(over!=0){
//                s+="and ";
//                short num = (short) (over/10);
//                short num2 = (short) (over%10);
//
//            }
//        }

        System.out.println(s);

    }
}
