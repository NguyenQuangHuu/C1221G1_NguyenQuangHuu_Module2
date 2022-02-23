package giai_thuat;

public class GiaiThuat {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for(int k = 6; k>i;k--){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int k = 1;k<(i+1)*2-1;k++){
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println("");
        }
        for(int i=1;i<5;i++){
            for(int k = 0; k<=i;k++){
                System.out.print(" ");
            }
            System.out.print(5-i);
            for(int k = 5*2; k>2*i;k--){
                System.out.print(" ");
            }
            System.out.print(5-i);
            System.out.println();
        }
    }
}
