package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

public class Address
{
    private String text;

    private String house;

    private String street;

    private String postalCode;

    private String district;

    private String city;

    private String county;

    private String stateCode;

    private String country;

    private String countryCode;

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public void setHouse(String house){
        this.house = house;
    }
    public String getHouse(){
        return this.house;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return this.street;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public String getPostalCode(){
        return this.postalCode;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public String getDistrict(){
        return this.district;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setCounty(String county){
        this.county = county;
    }
    public String getCounty(){
        return this.county;
    }
    public void setStateCode(String stateCode){
        this.stateCode = stateCode;
    }
    public String getStateCode(){
        return this.stateCode;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
    }
    public String getCountryCode(){
        return this.countryCode;
    }
}
