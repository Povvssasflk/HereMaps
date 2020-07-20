package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

import java.util.ArrayList;
import java.util.List;
public class OpeningHours
{
    private String text;

    private String label;

    private boolean isOpen;

    private List<Structured> structured;

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }
    public boolean getIsOpen(){
        return this.isOpen;
    }
    public void setStructured(List<Structured> structured){
        this.structured = structured;
    }
    public List<Structured> getStructured(){
        return this.structured;
    }
}
