package com.baseoop.zyf0113;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            tasks.add(new Task());
        }

        ThreadA ta = new ThreadA(tasks);
        ThreadB tb = new ThreadB(tasks);
        ThreadC tc = new ThreadC(tasks);

        ta.start();
        tb.start();
        tc.start();

//        try {
//            tc.join();
//            tb.join();
//            ta.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    int num = 0;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    for (int i = 0; i < tasks.size(); i++) {
                        if (tasks.get(i).num == 40000) {
                            num++;
                        }
                    }
                    System.out.println("已完成任务：" + num);
                }
            }
        }.start();


    }
}
