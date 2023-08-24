package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.TabStatus;
import br.com.devxlabs.ravin.models.entities.Customer;
import br.com.devxlabs.ravin.models.entities.OrderDetail;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class TabDTO implements Serializable {
    @Serial
    public static final long serialVersionUID = 42L;
    private int id;
    @NotNull(message = "A Comanda precisa esta vinculada a uma mesa.")
    private TableDTO tableDTO;
    @NotNull(message = "A Comanda precisa esta vinculada a um cliente.")
    private CustomerDTO customerDTO;
    private List<OrderDetailDTO> orderDetailsDTO;
    private String code;
    private String comments;
    private TabStatus tabStatus;

    public TabDTO() {

    }

    public TabDTO(int id, TableDTO tableDTO, CustomerDTO customerDTO, List<OrderDetailDTO> orderDetailsDTO, String code, String comments, TabStatus tabStatus) {
        this.id = id;
        this.tableDTO = tableDTO;
        this.customerDTO = customerDTO;
        this.orderDetailsDTO = orderDetailsDTO;
        this.code = code;
        this.comments = comments;
        this.tabStatus = tabStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TableDTO getTableDTO() {
        return tableDTO;
    }

    public void setTableDTO(TableDTO tableDTO) {
        this.tableDTO = tableDTO;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public List<OrderDetailDTO> getOrderDetailsDTO() {
        return orderDetailsDTO;
    }

    public void setOrderDetailsDTO(List<OrderDetailDTO> orderDetailsDTO) {
        this.orderDetailsDTO = orderDetailsDTO;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public TabStatus getTabStatus() {
        return tabStatus;
    }

    public void setTabStatus(TabStatus tabStatus) {
        this.tabStatus = tabStatus;
    }
}
