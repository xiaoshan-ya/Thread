public class Task {
    int num = 0;
    boolean fa = false;
    boolean fb = false;
    boolean fc = false;


    public void taskA() {
        //如果该任务没有执行线程A的任务
        if(!fa) {
            fa = true;
            num += 10;
        }
    }
    public void taskB() {
        //如果执行了A但没有执行B
        if(fa && !fb) {
            fb = true;
            num *= 20;        }
    }

    public void taskC() {
        //如果执行B但没有执行C
        if(fb && ! fc) {
            fc = true;
            num *= num;
        }
    }
}
