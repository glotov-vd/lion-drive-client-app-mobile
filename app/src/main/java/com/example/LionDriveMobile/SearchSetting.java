package com.example.LionDriveMobile;

public class SearchSetting {
    private String name;
    private Integer iconResource;

    public SearchSetting(String name, Integer iconResource) {
        this.name = name;
        this.iconResource = iconResource;
    }

    public String getName() { return this.name; }
    public Integer getIconResource() { return this.iconResource; }

    public void setName(String name) { this.name = name; }
    public void setIconResource(Integer iconResource) { this.iconResource = iconResource; }

}
