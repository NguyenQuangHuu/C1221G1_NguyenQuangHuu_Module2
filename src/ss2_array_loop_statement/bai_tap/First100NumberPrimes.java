package ss2_array_loop_statement.bai_tap;

public class First100NumberPrimes {
    private static boolean isPrime(int num) {
        boolean flag = true;
        if (num < 2) {
            flag = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        for(int i = 0; i<100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
