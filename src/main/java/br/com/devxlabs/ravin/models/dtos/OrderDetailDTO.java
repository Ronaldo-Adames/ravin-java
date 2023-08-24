package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.PreparationOrderStatus;
import br.com.devxlabs.ravin.models.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;

public class OrderDetailDTO implements Serializable {
    @Serial
    public static final long serialVersionUID = 42L;
    private int id;
    @NotNull(message = "O pedido não pode ser feito sem ter um produto.")
    private ProductDTO productDTO;
    private Timestamp requestDateTime;
    private Timestamp startPreparationDateTime;
    private Timestamp remainingPreparationTime;
    private PreparationOrderStatus preparationOrderStatus;
    private String comments;
    @NotBlank(message = "O campo quantidade de produto não pode estar em branco.")
    @NotEmpty(message = "O campo quantidade de produto não pode estar vazio.")
    private int quantity;

    public OrderDetailDTO() {

    }

    public OrderDetailDTO(int id, ProductDTO productDTO, Timestamp requestDateTime, Timestamp startPreparationDateTime, Timestamp remainingPreparationTime, PreparationOrderStatus preparationOrderStatus, String comments, int quantity) {
        this.id = id;
        this.productDTO = productDTO;
        this.requestDateTime = requestDateTime;
        this.startPreparationDateTime = startPreparationDateTime;
        this.remainingPreparationTime = remainingPreparationTime;
        this.preparationOrderStatus = preparationOrderStatus;
        this.comments = comments;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    public Timestamp getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Timestamp requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public Timestamp getStartPreparationDateTime() {
        return startPreparationDateTime;
    }

    public void setStartPreparationDateTime(Timestamp startPreparationDateTime) {
        this.startPreparationDateTime = startPreparationDateTime;
    }

    public Timestamp getRemainingPreparationTime() {
        return remainingPreparationTime;
    }

    public void setRemainingPreparationTime(Timestamp remainingPreparationTime) {
        this.remainingPreparationTime = remainingPreparationTime;
    }

    public PreparationOrderStatus getPreparationOrderStatus() {
        return preparationOrderStatus;
    }

    public void setPreparationOrderStatus(PreparationOrderStatus preparationOrderStatus) {
        this.preparationOrderStatus = preparationOrderStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}