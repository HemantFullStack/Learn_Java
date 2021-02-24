package bike;

import java.util.*;            //.* will import all type of class
public class LearnArray {
    public static void main(String[] args) {

        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};           //when an array is of character

     /*   int[] arr = {1,2,2,22,45,34};            //another way of initializing array
        int len = arr.length;
        System.out.println(len);


        int num[];              // declaring array
        num= new int[10];        // allocating memory to array
        num=new int[]{2,4,8,9,5,11};       //putting value to array
        for(int i=0;i<6;i++) {             // printing array
            System.out.println(num[i]);
        }

      */
            int val[];
            val=new int[5];
            System.out.println("enter 5 number:");
            Scanner sc=new Scanner(System.in);
            for(int j=0;j<5;j++){                             // taking array from user
                val[j]=sc.nextInt();
        }

          Arrays.sort(val);                 // sorting array
          System.out.println("sorted array is :");
            for(int k=0;k<5;k++){
                System.out.println(val[k]);
            }
        System.out.println("the third largest number is "+val[2]);


    }
}
