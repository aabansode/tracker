package com.dipeshimpl.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * The class is an alert entity which implements getter and setter in order to
 * store and retrieve alert objects.
 *
 * @author Dipesh Nainani
 */

@Entity
@NamedQueries({
        @NamedQuery(name = "Alert.findAll",
                query = "SELECT aler FROM Alert aler WHERE aler.type=:typealer")
})
public class Alert {

    @Id
    String id;

    public Alert() {
        this.id = UUID.randomUUID().toString();
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Vehicle vehicle;
    String type;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
