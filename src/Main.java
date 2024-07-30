import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] arr =  new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {1, 2, 3, 4, 5};

        //Task 2
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        //Task 3
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

        //Task 4
        System.out.println();
        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] % 2 != 0){
                arr[i]++;
            }
        }
        System.out.print(Arrays.toString(arr));

    }
}