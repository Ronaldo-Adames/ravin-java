package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.models.entities.Address;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class CustomerDTO implements Serializable {
    @Serial
    public static final long serialVersionUID = 42L;
    private int id;
    @NotBlank(message = "O campo nome não pode estar em branco.")
    @NotEmpty(message = "O campo nome não pode estar vazio.")
    private String name;
    private AddressDTO addressDTO;
    @NotBlank(message = "O campo telefone não pode estar em branco.")
    @NotEmpty(message = "O campo telefone não pode estar vazio.")
    private String phone;
    @CPF
    @NotBlank(message = "O campo CPF não pode estar em branco.")
    @NotEmpty(message = "O campo CPF não pode estar vazio.")
    private String cpf;
    @NotBlank(message = "O campo data de nascimento não pode estar em branco.")
    @NotEmpty(message = "Data ou formato invalido, use dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private String observations;
    private boolean hasActive = true;
    private String allergies;
    private boolean vip;

    public CustomerDTO () {

    }

    public CustomerDTO(int id, String name, AddressDTO addressDTO, String phone, String cpf, Date dateOfBirth, String observations, boolean hasActive, String allergies, boolean vip) {
        this.id = id;
        this.name = name;
        this.addressDTO = addressDTO;
        this.phone = phone;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
        this.observations = observations;
        this.hasActive = hasActive;
        this.allergies = allergies;
        this.vip = vip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public boolean isHasActive() {
        return hasActive;
    }

    public void setHasActive(boolean hasActive) {
        this.hasActive = hasActive;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
