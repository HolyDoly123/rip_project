package com.rip.rip_project.controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private Long id;
    private String fact;

    public Data() {
    }

    public Long getId() {
        return this.id;
    }

    public String getFact() {
        return this.fact;
    }

    @Override
    public String toString() {
        return "Data{" + "id=" + id + ", fact='" + fact + '\''+ '}';
    }
}