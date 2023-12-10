package com.ebp.starfleetbattles.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Counter {
    private @Id
    @GeneratedValue Long id;
    private String image;
    private String name;
    private int xcoord;
    private int ycoord;
    private UnitFaction faction;
    private String owner;

    Counter() {
    }

    Counter(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getXcoord() {
        return xcoord;
    }

    public void setXcoord(int xcoord) {
        this.xcoord = xcoord;
    }

    public int getYcoord() {
        return ycoord;
    }

    public void setYcoord(int ycoord) {
        this.ycoord = ycoord;
    }

    public UnitFaction getFaction() {
        return faction;
    }

    public void setFaction(UnitFaction faction) {
        this.faction = faction;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Counter)) return false;
        Counter counter = (Counter) o;
        return (Objects.equals(this.id, counter.id)
                && Objects.equals(this.name, counter.name)
                && Objects.equals(this.image, counter.image)
                && Objects.equals(this.xcoord, counter.xcoord)
                && Objects.equals(this.ycoord, counter.ycoord)
                && Objects.equals(this.faction, counter.faction)
                && Objects.equals(this.owner, counter.owner)
        );
    }

    @Override
    public String toString() {
        return "Counter{ id=" + this.id
                + ", name=" + this.name
                + ", image=" + this.image
                + ", xcoord=" + this.xcoord
                + ", ycoord=" + this.ycoord
                + ", faction=" + this.faction
                + ", owner=" + this.owner
                + '\'' + '}';

    }

}
