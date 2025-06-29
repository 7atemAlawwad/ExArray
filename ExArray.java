import java.util.Scanner;

public class ExArray {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to

//        System.out.print("Enter the number of elements in the array: ");
//        int [] num = {55, 42, 44, 55};
//        if (num[0] == num[num.length-1]) {
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.

//        int [] num = {2, 4, 7, 5 ,9};
//        int sum = 0;
//        for (int i = 0; i <= num.length-1; i++) {
//            sum  += num[i];
//        }
//        double avrage = sum/num.length;
//        System.out.println("The avarge is: "+avrage);
//
//        for (int i = 0; i <= num.length-1; i++) {
//            if(avrage < num[i]){
//                System.out.println("The number is greater than avarge: "+num[i]);
//            }
//        }

//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.


//        System.out.print("Enter the number of elements in the array: ");
//        int [] num = {22, 42, 44, 33};
//        if (num[0] > num[num.length-1]) {
//            System.out.println(num[0]);
//        }
//        else {
//            System.out.println(num[num.length-1]);
//        }

//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.

//        int[] original = {20, 30, 40};
//
//        int[] swapped = new int[original.length];
//
//        for (int i = 0; i < original.length; i++) {
//            swapped[i] = original[i];
//        }
//
//        int temp = swapped[0];
//        swapped[0] = swapped[swapped.length - 1];
//        swapped[swapped.length - 1] = temp;
//
//        for (int i = 0; i < original.length; i++) {
//            System.out.println(original[i]);
//        }
//
//        System.out.println("New array after swapping the first and last elements: ");
//        for (int i = 0; i < swapped.length; i++) {
//            System.out.println(swapped[i]);
//        }


//        5. Write a program that places the odd elements of an array before the
//        even elements.


//        int[] original = {2, 3, 40, 1, 5, 9, 4, 10, 7};
//
//        int[] arranged = new int[original.length];
//
//        int pos = 0;
//
//        for (int i = 0; i < original.length; i++) {
//            if (original[i] % 2 != 0) {
//                arranged[pos] = original[i];
//                pos++;
//            }
//        }
//
//        for (int i = 0; i < original.length; i++) {
//            if (original[i] % 2 == 0) {      // even
//                arranged[pos] = original[i];
//                pos++;
//            }
//        }
//
//        for (int i = 0; i < arranged.length; i++) {
//            System.out.print(arranged[i]);
//            if (i < arranged.length - 1) System.out.print(", ");
//        }
//

//        6. Write a program that test the equality of two arrays.

        int[] first  = {2, 3, 6, 6, 4};
        int[] second = {2, 3, 6, 6, 4};

        boolean equal = true;

        if (first.length != second.length) {
            equal = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.println(equal);
    }
}
