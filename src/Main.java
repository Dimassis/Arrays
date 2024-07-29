public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        int[] arr3 = {1, 2, 3, 4, 5};

        //Task 2
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i == arr2.length - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i == arr3.length - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

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
            System.out.print(arr[i] + " ");
        }
    }
}