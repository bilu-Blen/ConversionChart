package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int count = 0; count <= 15; count++ ){
            System.out.println(count);
            double result;
            result = count + 25.4;
            System.out.println(result);

        }

        int count = 0;
        double result;
        do {
            System.out.println(count);
            result = count + 25.4;
            System.out.println(result);
            count++;

        }while (count <= 15);

        while(count <= 15){
            System.out.println(count);
            result = count + 25.5;
            System.out.println(result);
            count++;

        }
    }
}
