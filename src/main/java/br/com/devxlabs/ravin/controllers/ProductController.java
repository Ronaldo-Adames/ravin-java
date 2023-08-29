package br.com.devxlabs.ravin.controllers;

import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import br.com.devxlabs.ravin.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
