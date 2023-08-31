package br.com.devxlabs.ravin.services;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.models.entities.Product;
import br.com.devxlabs.ravin.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {// todas as validações e regras de negócio devem ser feitas nos services

    @Autowired
    ProductRepository productRepository;

    public List<ProductDTO> listAll() {
        return List.of(new ProductDTO(), new ProductDTO());
    }

    public ProductDTO findById(long id) {
        Optional<Product> optional = productRepository.findById(id);
        return  null;
    }

    public void deleteById(long id) {
        System.out.println("Produto excluido com sucesso!");
    }

    public List<ProductDTO> search(String nome, String productType, double minSalePrice, double maxSalePrice) {
        System.out.println("Buscando produtos com filtros.");
        return List.of(new ProductDTO(), new ProductDTO());
    }
}
