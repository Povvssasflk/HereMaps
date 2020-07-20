package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

public class Category
{
    private String id;

    private String title;

    private String href;

    private String type;

    private String system;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setHref(String href){
        this.href = href;
    }
    public String getHref(){
        return this.href;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setSystem(String system){
        this.system = system;
    }
    public String getSystem(){
        return this.system;
    }
}
