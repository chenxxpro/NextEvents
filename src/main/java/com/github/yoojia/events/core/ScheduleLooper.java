package com.github.yoojia.events.core;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.2
 */
abstract class ScheduleLooper implements Runnable{

    @Override
    public void run() {
        while ( ! Thread.interrupted()) {
            step();
        }
    }

    protected final void await(){
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    protected abstract void step();
}
