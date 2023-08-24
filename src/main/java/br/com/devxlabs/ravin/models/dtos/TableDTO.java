package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.TableStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class TableDTO implements Serializable {
    @Serial
    public static final long serialVersionUID = 42L;
    private int id;
    @NotNull(message = "A mesa precisa que um graçon estaja vinculado a ela.")
    private EmployeeDTO employeeDTO;
    private List<TabDTO> tabsDTO;
    @NotBlank(message = "O campo nome não pode estar em branco.")
    @NotEmpty(message = "O campo nome não pode estar vazio.")
    private String name;
    @NotNull(message = "A mesa precisa ter um código vinculado.")
    private String code;
    @NotNull(message = "A mesa precisa ter um número vinculado.")
    private int number;
    @NotBlank(message = "O campo status mesa não pode estar em branco.")
    @NotEmpty(message = "O campo status mesa não pode estar vazio.")
    private TableStatus tableStatus;
}
