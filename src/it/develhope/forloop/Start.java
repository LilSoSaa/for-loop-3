package it.develhope.forloop;


import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {


        String arr[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //printo per vedere i giorni della settimana
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arr[i]= arr[i].toUpperCase();
                System.out.println(Arrays.toString(arr));



        }
    }
}


