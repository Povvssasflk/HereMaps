package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

import java.util.List;

import java.util.ArrayList;
import java.util.List;
public class Results
{
    private String next;

    private List<Items> items;

    public void setNext(String next){
        this.next = next;
    }
    public String getNext(){
        return this.next;
    }
    public void setItems(List<Items> items){
        this.items = items;
    }
    public List<Items> getItems(){
        return this.items;
    }
}