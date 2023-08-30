package br.com.devxlabs.ravin.services;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {// todas as validações e regras de negócio devem ser feitas nos services

    public List<ProductDTO> listAll() {
        return List.of(new ProductDTO(), new ProductDTO());
    }

    public ProductDTO findById(long id) {
        return  new ProductDTO();
    }

    public void deleteById(long id) {
        System.out.println("Produto excluido com sucesso!");
    }

    public List<ProductDTO> search(String nome, String productType, double minSalePrice, double maxSalePrice) {
        System.out.println("Buscando produtos com filtros.");
        return List.of(new ProductDTO(), new ProductDTO());
    }
}
