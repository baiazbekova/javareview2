package com.cybertek.core;

public class Methods {

    //no return type and no parameter
    public void methodA(){
        System.out.println("methodA() is called");
    }

    //no return type with parameter, parameter can be either reference type or primitive data type
    public void methodA(String str){
        System.out.println("MethodA(String str) is called");
    }

    //with return type String
    public String methodB(){
        return "methodB() is called";
    }

    //with return type String and accepting one parameter x
    public String methodB(int x){
        return "methodB(int x) is called";
    }

    //utilities classes are created this way.
    //how can i say this method needs to be static? static method belongs to class
    //how do we know if method should be static or instance method:
    //if the static method does not depend on instance variable, then we can use static
    public static void methodC(){
        System.out.println("methodC() is called");
    }

}
