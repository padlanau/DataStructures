package com.company;

public class Factorial {

    private static int factorialValue;

    public static void main(String[] args) {

        factorialValue= RecursiveFactorial(5);

        System.out.print("Factorial of 5 is" + = String.valueOf(factorialValue));
    }


    public static int RecursiveFactorial(int n){

        // base cases; fact 0f 0 is 1

        if (n==0)
            return 1;

        else;

        return n * RecursiveFactorial(n-1);

    }



}
