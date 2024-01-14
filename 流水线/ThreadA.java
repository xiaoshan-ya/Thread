import java.util.ArrayList;

public class ThreadA extends Thread {
    ArrayList<Task> task = new ArrayList<>();

    public ThreadA(ArrayList<Task> task) {
        this.task = task;
    }

    @Override
    public void run() {
        while (true) {
            int count = 0;
            for(Task t: task) {
                t.taskA();
                if (t.fa) {
                    count++;
                }
            }

            System.out.println("A已执行："+ count);
            if (count == task.size()) {
                System.out.println("A全部完成");
            }
        }
    }
}
