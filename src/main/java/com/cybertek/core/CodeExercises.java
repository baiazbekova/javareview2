package com.cybertek.core;

public class CodeExercises {

    //Write a method that sums two numbers.
    public Integer sum(Integer i, Integer j) {
            int sum=0;
            sum=i+j;
        System.out.println(sum);
        return sum;
    }


    //Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
    public Integer sum(Integer n) {
        int sumOfTwo = 0;
        for (int i = 0; i <= n; i++) {
            if (n % 3 == 0 & n % 5 == 0) {
                sumOfTwo += i;
                System.out.println(sumOfTwo);
            }
        }
        return sumOfTwo;
    }

    //Write a method that calculates the factorial of a given number.
    //Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
    //TIP: To make it more interesting, try to do it recursively.
    public Integer factorial(Integer n) {
        int factorial=n;

        for(int i=factorial-1; i>0; i--){
            factorial = factorial*i;
        }
    return factorial;
    }

}
