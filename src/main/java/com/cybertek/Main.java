package com.cybertek;

import com.cybertek.core.CodeExercises;
import com.cybertek.core.Methods;

public class Main {
    public static void main (String[] args){

        //********CORE*******//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(6));
        Methods.methodC();

        //coding exercises
        //1
        CodeExercises codeExercises = new CodeExercises();
        System.out.println(codeExercises.sum(10,20));

        //2
        CodeExercises codeExercises1=new CodeExercises();
        System.out.println(codeExercises1.sum(15));

        //3
        CodeExercises codeExercises2 = new CodeExercises();
        System.out.println(codeExercises2.factorial(8));



    }
}
