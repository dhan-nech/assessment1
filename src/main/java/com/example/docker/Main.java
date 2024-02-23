package com.example.docker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayName = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            System.out.println("Enter number " + (i+1));
            int entry = sc.nextInt();
            arrayName.add(entry);
        }

        /*for(int i : arrayName){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println("Total Even numbers is = " + sum);*/

        EvenAdder evenAdder = new EvenAdder(arrayName);
        System.out.println("Sum = " + evenAdder.getEvenSum());
    }
}
