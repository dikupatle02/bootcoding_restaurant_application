package com.bootcoding.restaurant.exception;

import java.util.Scanner;

public class ExceptionExample2 {
    public int testException() {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        try {
            n = n / 10;
        }
        catch(Exception ex){
            //code after getting exception
            System.out.println("Only Integer Number Supported!");
            ex.printStackTrace();
        }
        return n;

    }

    public static void main(String[] args){
        ExceptionExample2 exceptionExample2 = new ExceptionExample2();
        System.out.println(exceptionExample2.testException());
    }
    }
