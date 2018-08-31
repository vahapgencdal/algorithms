package com.threadscheduler;

public class SimpleThread extends Thread {
    private int value;

    public SimpleThread(int value) {
        this.value = value;
        start();
    }

    @Override
    public void run() {
        super.run();
        while (true){
            synchronized (this){
                try {
                    wait();
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
                System.out.println(value+" ");
            }
        }
    }
}
