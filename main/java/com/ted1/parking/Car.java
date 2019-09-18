package com.ted1.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
        private String id; //new can't change
        private LocalDateTime enter;
        private LocalDateTime leave;
        //alt enter Constructor
        public Car(String id, LocalDateTime enter) {
            this.id = id;
            this.enter = enter;
        }
        public void leave(){
            leave=LocalDateTime.now();
        }


        public void setLeave(LocalDateTime leave){
            if(leave.isAfter(enter)){
                this.leave=leave;
            }
        }
        //car
        public long getDuration(){
            Duration duration = Duration.between(enter,leave);
            return duration.toMinutes();
        }













}
