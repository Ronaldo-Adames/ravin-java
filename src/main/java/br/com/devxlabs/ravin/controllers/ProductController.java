package br.com.devxlabs.ravin.controllers;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    @Autowired//intância por debaixo dos panos o service
    ProductService service;

    @GetMapping("/list-all")
    public List<ProductDTO> listAll() {
        return service.listAll();
    }

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable int id) {// @PathVariable indica o campo do caminho da api entre {id}
        return service.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable int id) {// @PathVariable indica o campo do caminho da api entre {id}
        service.deleteById(id);
    }

    @GetMapping("/search")
    public List<ProductDTO> search(
            @RequestParam("name") String name,
            @RequestParam("productType") String productType,
            @RequestParam("minSalePrice") float minSalePrice,
            @RequestParam("maxSalePrice") float maxSalePrice
    ) {
        return service.search(name, productType, minSalePrice, maxSalePrice);
    }


}
