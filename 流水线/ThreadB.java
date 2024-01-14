import java.util.ArrayList;

public class ThreadB extends  Thread{
    ArrayList<Task> task = new ArrayList<>();

    public ThreadB(ArrayList<Task> task) {
        this.task = task;
    }


    @Override
    public void run() {
        while (true) {
            int count = 0;
            for(Task t: task) {
                t.taskB();
                if (t.fb) {
                    count++;
                }
            }

            System.out.println("B已执行："+ count);
            if (count == task.size()) {
                System.out.println("B全部完成");
            }
        }
    }
}
