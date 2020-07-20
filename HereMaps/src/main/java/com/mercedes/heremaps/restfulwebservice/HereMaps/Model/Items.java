package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

import java.util.List;
public class Items implements Comparable<Items>
{
    private List<Double> position;

    private int distance;

    private String title;

    private int averageRating;

    private Category category;

    private String icon;

    private String vicinity;

    private List<String> having;

    private String type;

    private String href;

    private String id;

    private OpeningHours openingHours;

    private List<AlternativeNames> alternativeNames;

    public void setPosition(List<Double> position){
        this.position = position;
    }
    public List<Double> getPosition(){
        return this.position;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
    public int getDistance(){
        return this.distance;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAverageRating(int averageRating){
        this.averageRating = averageRating;
    }
    public int getAverageRating(){
        return this.averageRating;
    }
    public void setCategory(Category category){
        this.category = category;
    }
    public Category getCategory(){
        return this.category;
    }
    public void setIcon(String icon){
        this.icon = icon;
    }
    public String getIcon(){
        return this.icon;
    }
    public void setVicinity(String vicinity){
        this.vicinity = vicinity;
    }
    public String getVicinity(){
        return this.vicinity;
    }
    public void setHaving(List<String> having){
        this.having = having;
    }
    public List<String> getHaving(){
        return this.having;
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
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setOpeningHours(OpeningHours openingHours){
        this.openingHours = openingHours;
    }
    public OpeningHours getOpeningHours(){
        return this.openingHours;
    }
    public void setAlternativeNames(List<AlternativeNames> alternativeNames){
        this.alternativeNames = alternativeNames;
    }
    public List<AlternativeNames> getAlternativeNames(){
        return this.alternativeNames;
    }
	@Override
	public int compareTo(Items item) {
		return Integer.compare(this.distance,item.distance);
	}
	
}
