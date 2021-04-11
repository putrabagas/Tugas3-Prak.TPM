package com.example.dota;

public class HeroModel {

    private String  image, name,role,lore;

    public HeroModel(String image, String name, String role, String lore) {
        this.image = image;
        this.name = name;
        this.role = role;
        this.lore = lore;
    }

    public HeroModel(){

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }
}
