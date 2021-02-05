package xin.jiuzhiqian.study.tools;

import java.util.Arrays;

/**
 * @author : feng
 */
public class BigQueue {
    private int[] queue;
    private int index = 0;

    public BigQueue() {
        this.queue = new int[8];
    }

    public BigQueue(int len) {
        this.queue = new int[len];
    }

    public void add(int num) {
        if (++index > queue.length) {
            this.queue = Arrays.copyOf(this.queue, 2 * queue.length);
        }
        for (int i = 0; i < index; i++) {
            int tmp = this.queue[i];
            if (num >= this.queue[i]) {
                while (i < index) {
                    
                }
            }
        }
    }
}