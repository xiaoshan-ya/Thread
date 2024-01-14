package com.baseoop.zyf0113;

import java.util.ArrayList;

public class ThreadC extends Thread {
    ArrayList<Task> tasks;

    public ThreadC(ArrayList<Task> tasks) {
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
            System.out.println("ThreadC - run");
            int count = 0;
            for (int i = 0; i < tasks.size(); i++) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Task task = tasks.get(i);
                task.taskC();
                if (task.fc) {
                    count++;
                }
            }
            System.out.println("已完成C任务：" + count);
            if(count==tasks.size()){
                System.out.println("C任务全部完成！");
                break;
            }
        }
    }

}
