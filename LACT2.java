package com.example.activity;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        arr[5] = 7;
        arr[6] = 8;
        arr[7] = 9;
        arr[8] = 10;
        arr[9] = 11;
        
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("The total number of all arrays are:" + total);

    }
}