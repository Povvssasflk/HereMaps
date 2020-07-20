package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

public class AlternativeNames
{
    private String name;

    private String language;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
    }
}