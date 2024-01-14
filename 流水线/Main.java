import java.util.*;

public class Main {
    public static void main (String[] args) {
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

        new thread() {
            @Override
            public void run() {
                // 保证线程一直开着，可以不断加入新的线程任务继续执行
                while (true) {
                    int num = 0;

                    for (Task task: tasks) {
                        if (task.num == 40000) {
                            num++;
                        }
                    }
                    System.out.println("已完成任务：" + num);
                }

            }
        }.start();
    }
}
