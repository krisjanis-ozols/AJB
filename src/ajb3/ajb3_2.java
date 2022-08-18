package ajb3;

import java.util.Random;

public class ajb3_2 {

//    2) Declare and initialize an array with four arbitrary whole numbers.
//    // Write a Java program to copy this array by iterating it.

    public static void main(String[] args){

        Random r = new Random();
        int[] arr = new int[4];
        System.out.println("Original:");
        for(int i=0;i<4;i++){
            arr[i]=r.nextInt(100);
            System.out.println(arr[i]);
        }
        int[] arr2 = new int[arr.length];

        System.out.println("Copy:");
        for(int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
            System.out.println(arr2[i]);
        }


    }

}
