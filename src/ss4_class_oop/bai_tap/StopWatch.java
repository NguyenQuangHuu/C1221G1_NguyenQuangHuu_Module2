package ss4_class_oop.bai_tap;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long stopTime;
    public StopWatch(){
        this.startTime = new Date().getDate();
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

    public long start(){
        this.setStartTime(new Date().getTime());
        return this.getStartTime();
    }

    public long stop(){
        this.setStopTime(new Date().getTime());
        return this.getStopTime();
    }
    public long getElapsedTime(){
        return this.getStopTime() - this.getStartTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getStartTime());

        stopWatch.start();
        for(int i = 0 ; i<10000; i++){
            System.out.println(stopWatch.getStartTime());
        }
        stopWatch.stop();
        System.out.println(stopWatch.getStopTime());
        System.out.println(stopWatch.getElapsedTime()*1000);
    }
}


