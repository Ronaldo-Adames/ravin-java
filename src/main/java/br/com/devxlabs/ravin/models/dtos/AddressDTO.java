package br.com.devxlabs.ravin.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serial;
import java.io.Serializable;

public class AddressDTO implements Serializable {
    @Serial
    public static final long serialVersionUID = 42L;
    @NotBlank(message = "O campo estado não pode estar em branco.")
    @NotEmpty(message = "O campo estado não pode estar vazio.")
    private String state;
    @NotBlank(message = "O campo cidade não pode estar em branco.")
    @NotEmpty(message = "O campo cidade não pode estar vazio.")
    private String city;
    @NotBlank(message = "O campo rua não pode estar em branco.")
    @NotEmpty(message = "O campo rua não pode estar vazio.")
    private String street;
    @NotBlank(message = "O campo CEP não pode estar em branco.")
    @NotEmpty(message = "O campo CEP não pode estar vazio.")
    private String zipCode;

    public AddressDTO() {

    }

    public AddressDTO(String state, String city, String street, String zipCode) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
