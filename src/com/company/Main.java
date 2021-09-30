package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Enter array of numbers returns array of integers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int[] b = new int [in.nextInt()];
        System.out.print("Enter  numbers of array-");
        for (int n=0; n< b.length; n++)  {
            if (in.hasNextInt()){
                b[n] =  in.nextInt();
            } else if (in.hasNextFloat()) {in.nextFloat();}
        }
        int[] c = Arrays.stream(b).filter(num ->num!=0).toArray();
        System.out.print(Arrays.toString(c));
        }
            }


