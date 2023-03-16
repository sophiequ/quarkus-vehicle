package at.htl.vehicle.rental;

import at.htl.vehicle.person.Person;
import at.htl.vehicle.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Rental {

    private Long id;
    private Vehicle vehicle;
    private Person person;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private double discount;

    public Rental() {
    }

    public Rental(Vehicle vehicle, Person person, LocalDateTime startDateTime, LocalDateTime endDateTime, double discount) {
        this.vehicle = vehicle;
        this.person = person;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", vehicle=" + vehicle +
                ", person=" + person +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", discount=" + discount +
                '}';
    }
}
