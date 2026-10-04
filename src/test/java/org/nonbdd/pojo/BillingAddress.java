package org.nonbdd.pojo;

public class BillingAddress {

    private String firstName;
    private String lastName;
    private String billingAddress;
    private String city;
    private String zipCode;
    private String email;

    public BillingAddress() {
    }

    public BillingAddress(String firstName, String lastName, String billingAddress, String city, String zipCode, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.billingAddress = billingAddress;
        this.city = city;
        this.zipCode = zipCode;
        this.email = email;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





}
