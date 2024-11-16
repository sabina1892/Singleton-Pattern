package org.example;

import java.util.*;
class Singleton{
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getSingleInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void showMessage( String str){
        System.out.println("Hello I am a singleton! Let me say " + str + " to you");
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton stn = Singleton.getSingleInstance();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stn.showMessage(str);

    }
}


