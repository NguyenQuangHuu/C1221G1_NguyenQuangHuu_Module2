package ss4_class_oop.bai_tap;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long stopTime;
    public StopWatch(){
        this.startTime = new Date().getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public void start(){
        this.setStartTime(new Date().getTime());

    }

    public void stop(){
        this.setStopTime(new Date().getTime());
    }
    public long getElapsedTime(){
        return this.getStopTime() - this.getStartTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getStartTime());

        stopWatch.start();
        for(int i = 0 ; i<100000; i++){
            System.out.println(i);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getStopTime());
        System.out.println(stopWatch.getElapsedTime()+" milliseconds");
    }
}


