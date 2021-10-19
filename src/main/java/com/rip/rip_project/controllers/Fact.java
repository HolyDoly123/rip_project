package com.rip.rip_project.controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fact {
    private Data data;
    private Boolean status;

    public Fact() {
    }

    public Boolean getStatus(){
        return status;
    }

    public Data getData(){
        return data;
    }

    @Override
    public String toString() {
        return "Fact{" + "status='" + status + '\'' + ", data=" + data + '}';
    }
}