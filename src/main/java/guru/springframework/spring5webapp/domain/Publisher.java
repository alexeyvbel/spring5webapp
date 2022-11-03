package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Publisher {

    private Long id;

    private String address;

    private String city;

    private String state;

    private String zip;

    public Publisher(String address, String city, String state, String zip) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(id, publisher.id) && Objects.equals(address, publisher.address) && Objects.equals(city, publisher.city) && Objects.equals(state, publisher.state) && Objects.equals(zip, publisher.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, city, state, zip);
    }
}
