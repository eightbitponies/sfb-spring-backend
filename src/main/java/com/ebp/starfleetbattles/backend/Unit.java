package com.ebp.starfleetbattles.backend;

import jakarta.persistence.Entity;

@Entity
public class Unit extends Counter{

    private int currentSpeed;
    private UnitFacing facing;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public UnitFacing getFacing() {
        return facing;
    }

    public void setFacing(UnitFacing facing) {
        this.facing = facing;
    }

    Unit(){
        super();
    }


}
