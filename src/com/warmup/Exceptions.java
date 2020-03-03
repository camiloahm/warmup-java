package com.warmup;

public class Exceptions {

    public static void main(String args[]){
        try{
            throw new IllegalArgumentException();
        }catch (Exception e){
            throw e;
        }finally {
            throw new IllegalStateException();
        }
    }

}
