package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.EmployeeAviability;
import br.com.devxlabs.ravin.enums.MeritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;
import br.com.devxlabs.ravin.models.entities.Address;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class EmployeeDTO implements Serializable {
    @Serial
    public static final long serialVersionUID = 42L;// atributo obrigatório, pegar da documentação do Serializable
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
    @NotNull(message = "Selecione uma Data.")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private String observations;
    private boolean hasActive = true;
    @NotBlank(message = "O campo RG não pode estar em branco.")
    @NotEmpty(message = "O campo RG não pode estar vazio.")
    private String rg;
    @NotNull(message = "Selecione um estdo civil.")
    private MeritalStatus meritalStatus;
    @NotNull(message = "Selecione uma escolaridade.")
    private Schooling schooling;
    @NotNull(message = "Selecione um cargo.")
    private Responsibility responsability;
    @NotBlank(message = "O campo PIS não pode estar em branco.")
    @NotEmpty(message = "O campo PIS não pode estar vazio.")
    private int pis;
    @NotBlank(message = "O campo data de admissão não pode estar em branco.")
    @NotEmpty(message = "Data ou formato invalido, use dd/MM/yyyy")
    @NotNull(message = "Selecione uma Data.")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date admissionDate;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date resignationDate;
    private EmployeeAviability employeeAviability = EmployeeAviability.AVAILABLE;

    public EmployeeDTO () {

    }

    public EmployeeDTO(int id, String name, AddressDTO addressDTO, String phone, String cpf, Date dateOfBirth, String observations, boolean hasActive, String rg, @NotNull(message = "Selecione um estdo civil.") MeritalStatus meritalStatus, @NotNull(message = "Selecione uma escolaridade.") Schooling schooling, @NotNull(message = "Selecione um cargo.") Responsibility responsability, int pis, @NotNull(message = "Selecione uma Data.") Date admissionDate, Date resignationDate, EmployeeAviability employeeAviability) {
        this.id = id;
        this.name = name;
        this.addressDTO = addressDTO;
        this.phone = phone;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
        this.observations = observations;
        this.hasActive = hasActive;
        this.rg = rg;
        this.meritalStatus = meritalStatus;
        this.schooling = schooling;
        this.responsability = responsability;
        this.pis = pis;
        this.admissionDate = admissionDate;
        this.resignationDate = resignationDate;
        this.employeeAviability = employeeAviability;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public MeritalStatus getMeritalStatus() {
        return meritalStatus;
    }

    public void setMeritalStatus(MeritalStatus meritalStatus) {
        this.meritalStatus = meritalStatus;
    }

    public Schooling getSchooling() {
        return schooling;
    }

    public void setSchooling(Schooling schooling) {
        this.schooling = schooling;
    }

    public Responsibility getResponsability() {
        return responsability;
    }

    public void setResponsability(Responsibility responsability) {
        this.responsability = responsability;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getResignationDate() {
        return resignationDate;
    }

    public void setResignationDate(Date resignationDate) {
        this.resignationDate = resignationDate;
    }

    public EmployeeAviability getEmployeeAviability() {
        return employeeAviability;
    }

    public void setEmployeeAviability(EmployeeAviability employeeAviability) {
        this.employeeAviability = employeeAviability;
    }
}
