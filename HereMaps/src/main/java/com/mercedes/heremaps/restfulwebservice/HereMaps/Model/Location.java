package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

import java.util.ArrayList;
import java.util.List;
public class Location
{
    private List<Double> position;

    private Address address;

    public void setPosition(List<Double> position){
        this.position = position;
    }
    public List<Double> getPosition(){
        return this.position;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return this.address;
    }
}
