package com.baseoop.zyf0113;

import java.util.ArrayList;

public class ThreadA extends Thread {
    ArrayList<Task> tasks;

    public ThreadA(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while(true) {


            System.out.println("ThreadA - run");
            int count=0;
            for (int i = 0; i < tasks.size(); i++) {
//            if (i == 5) {
//                continue;
//            }
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Task task = tasks.get(i);
                task.taskA();
                if(task.fa){
                    count++;
                }


            }
            System.out.println("A任务完成："+count);
            if(count==tasks.size()){
                System.out.println("A任务全部完成");
                break;
            }
        }

    }
}
