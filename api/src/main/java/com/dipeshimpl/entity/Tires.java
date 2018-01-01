package com.dipeshimpl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * The class is a tires entity which implements getter and setter in order to
 * store and retrieve tires objects.
 *
 * @author Dipesh Nainani
 */

@Entity
public class Tires {

    @Id
    String id;

    public Tires(){
        this.id = UUID.randomUUID().toString();
    }

    int frontLeft;
    int frontRight;
    int rearLeft;
    int rearRight;

    public int getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(int frontLeft) {
        this.frontLeft = frontLeft;
    }

    public int getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(int frontRight) {
        this.frontRight = frontRight;
    }

    public int getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(int rearLeft) {
        this.rearLeft = rearLeft;
    }

    public int getRearRight() {
        return rearRight;
    }

    public void setRearRight(int rearRight) {
        this.rearRight = rearRight;
    }
}
