package com.neoteric.functiondemo1.function;

public class HelloWorldVMArguments {
    public static void main(String[] arg){
        String name =System.getProperty("companyname");
        String myname =System.getProperty("myname");
        System.out.println("HelloWorld VMarguments == "+name +myname);


        String myownenv = System.getenv("myownenv");
        String otherenv = System.getenv("otherenv");
        System.out.println("HelloWorld env arguments == "+myownenv);
        System.out.println("HelloWorld env arguments == "+otherenv);


    }

}
