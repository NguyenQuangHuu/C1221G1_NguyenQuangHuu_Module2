package ss2_array_loop_statement.thuc_hanh;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, -8, 3, 9};

        int min = minArray(arr);
        System.out.println("Số nhỏ nhất trong mảng là: "+min);
    }
    private static int minArray(int[] array){
        int min = array[0];
        for(int i = 1;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
