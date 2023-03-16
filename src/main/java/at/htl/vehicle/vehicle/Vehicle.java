package at.htl.vehicle.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "X_VEHICLE")
//@NamedQueries({
    @NamedQuery(
        name = "Vehicle.findAll",
        query = "select v from Vehicle v "
    )
    //, ...
//})
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "v_id")
    private Long id;

    @Column(name = "v_model", nullable = false, unique = true)
    private String model;

    @Column(name = "v_brand", nullable = false)
    private String brand;

    //region constructors
    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public Vehicle() {
    }
    //endregion

    //region getters/setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    //endregion


    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
