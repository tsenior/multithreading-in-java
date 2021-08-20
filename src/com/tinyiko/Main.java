package com.tinyiko;

public class Main {

    public static void main(String[] args) {
//        var instance = new Thread(new RunnableExample());

        Thread thread1 = new Thread(new RunnableExample());
        thread1.setName("First thread");
        thread1.start();


        Thread thread2 = new Thread(new RunnableExample());
        thread2.setName("Second thread");
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while (i <= 100){
                    System.out.println(i + " " + Thread.currentThread().getName());
                    i++;
                }
            }
        });

        thread3.setName("third thread");
        thread3.start();

//        thread1.start();
//        thread2.start();
//        thread3.start();


    }
}
