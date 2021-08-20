package com.tinyiko;

public class Main {

    public static void main(String[] args) {
    //   System.out.println("number of threads: "+ Thread.activeCount());

        ThreadExample thread1 = new ThreadExample();
        thread1.setName("First thread");
        thread1.start();


        ThreadExample thread2 = new ThreadExample();
        thread2.setName("Second thread");
        thread2.start();


    }
}
