package com.baseoop.zyf0113;

class Task {
    int num;
    boolean fa = false;
    boolean fb = false;
    boolean fc = false;

    public void taskA() {
        if (!fa) {
            num += 10;
            fa = true;
        }
    }

    // 阻塞
    public void taskB() {
//        while (!fa) {
//
//        }
        if (fa & !fb) {
            num *= 20;
            fb = true;
        }
    }

    public void taskC() {
//        while (!fb) {
//
//        }
        if (fb & !fc) {
            num *= num;
            fc = true;
        }
    }
    // num=40000

}