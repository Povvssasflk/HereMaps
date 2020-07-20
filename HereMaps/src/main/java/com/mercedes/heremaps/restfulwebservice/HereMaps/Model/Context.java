package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

public class Context
{
    private Location location;

    private String type;

    private String href;

    public void setLocation(Location location){
        this.location = location;
    }
    public Location getLocation(){
        return this.location;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setHref(String href){
        this.href = href;
    }
    public String getHref(){
        return this.href;
    }
}
