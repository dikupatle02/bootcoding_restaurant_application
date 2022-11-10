package com.bootcoding.restaurant.exception;

import java.util.Scanner;

public class ExceptionExample1 {
    public void testException(){
        do{
            try{
                Scanner sc = new Scanner(System.in);
                int i = Integer.parseInt(sc.next());
                System.out.println("Value of Input : " + i);
                System.out.println(" I am in try ");
                //Code error posibilities
                break;
            }
            catch(Exception ex){
                //code after getting exception
                System.out.println("Only Integer Number Supported!");
                ex.printStackTrace();
            }
        }
        while (true);
    }
    public static void main(String[] args){
        new ExceptionExample1().testException();
    }
}
