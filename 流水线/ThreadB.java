package com.baseoop.zyf0113;

import java.util.ArrayList;

public class ThreadB extends Thread {
    ArrayList<Task> tasks;

    public ThreadB(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("ThreadB - run");
            int count = 0;
            for (int i = 0; i < tasks.size(); i++) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Task task = tasks.get(i);
                task.taskB();
                if (task.fb) {
                    count++;
                }
            }
            System.out.println("已完成B任务：" + count);
            if (count == tasks.size()) {
                System.out.println("B任务全部完成！");
                break;
            }
        }

    }
}
