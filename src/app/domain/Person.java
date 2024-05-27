package app.domain;

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

    public Integer getBorn(Integer i) {
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


