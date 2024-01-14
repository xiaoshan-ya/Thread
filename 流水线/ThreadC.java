import java.util.ArrayList;

public class ThreadC  extends Thread{
    ArrayList<Task> task = new ArrayList<>();

    public ThreadC(ArrayList<Task> task) {
        this.task = task;
    }

    @Override
    public void run() {
        while (true) {
            int count = 0;
            for(Task t: task) {
                t.taskC();
                if (t.fc) {
                    count++;
                }
            }

            System.out.println("C已执行："+ count);
            if (count == task.size()) {
                System.out.println("C全部完成");
            }
        }
    }
}
