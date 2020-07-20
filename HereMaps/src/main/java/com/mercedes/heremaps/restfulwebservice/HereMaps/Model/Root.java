package com.mercedes.heremaps.restfulwebservice.HereMaps.Model;

public class Root
{
    private Results results;

    private Search search;

    public void setResults(Results results){
        this.results = results;
    }
    public Results getResults(){
        return this.results;
    }
    public void setSearch(Search search){
        this.search = search;
    }
    public Search getSearch(){
        return this.search;
    }
}