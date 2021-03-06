package com.atlassian.util.benchmark;

class Timer {
    long start;
    long total;
    Throwable t;

    Timer start() {
        start = System.nanoTime();
        return this;
    }

    void stop() {
        total = System.nanoTime() - start;
    }

    void setThrowable(Throwable t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return Util.format(total);
    }
}