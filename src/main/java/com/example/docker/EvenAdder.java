package com.example.docker;

import java.util.ArrayList;

public class EvenAdder {
    private ArrayList<Integer> store = new ArrayList<>();
    int sum = 0;

    public EvenAdder(ArrayList<Integer> store) {
        this.store = store;
    }

    public int getEvenSum(){
        for(int i : store){
            if(i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
