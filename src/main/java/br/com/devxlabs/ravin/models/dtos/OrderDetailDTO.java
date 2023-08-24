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
    @NotEmpty(message = "O campo quantidade de produto não pode estar em vazio.")
    private int quantity;

}