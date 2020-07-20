package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

public class Structured
{
    private String start;

    private String duration;

    private String recurrence;

    public void setStart(String start){
        this.start = start;
    }
    public String getStart(){
        return this.start;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public String getDuration(){
        return this.duration;
    }
    public void setRecurrence(String recurrence){
        this.recurrence = recurrence;
    }
    public String getRecurrence(){
        return this.recurrence;
    }
}