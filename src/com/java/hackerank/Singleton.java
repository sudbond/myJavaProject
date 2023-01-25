package com.java.hackerank;

class Singleton{
public String str;
    private static final Singleton INSTANCE = new Singleton();
    private Singleton(){
        
    }
    public static Singleton getSingleInstance(){
        return INSTANCE;
    }
}