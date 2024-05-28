package app.domain;

import java.util.Objects;

public class Person {

    private Integer born;
    private String name;
    private String address;
    private String insuranceNumber;

    public Person(int born, String name, String address, String insuranceNumber) {
        this.born = born;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(born, person.born) && Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.equals(insuranceNumber, person.insuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(born, name, address, insuranceNumber);
    }

    public void setBorn(Integer born) {
        this.born = born;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public Integer getBorn() {
        return born;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return String.format("Person: born -%d, name - %s, address - %s",
                born, name, address, insuranceNumber);
    }
}


