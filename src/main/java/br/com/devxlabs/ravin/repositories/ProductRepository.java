package br.com.devxlabs.ravin.repositories;

import br.com.devxlabs.ravin.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByName(String name);
    Optional<Product> findByCostprice(double costPrice);

    @Query("SELECT p form product p where p.costPrice <= :costPrice AND p.salePrice >= :salePrice")
    List<Product> findByCostpriceAndSalePrice(@Paran("costPrice") double costPrice,@Paran("salePrice") double salePrice);

    @Query("SELECT p.name p.costprice, p.createDate from Product p")
    List<String> findProductNome();

    @Query(value = "SELECT name from Product where productType = :productType AND createDate = TODAY()", nativeQuery = true)
    List<String> findProductNamesByProductTypeInsertedToday(String productType);


    Page<Product> findAll(Pageable pageable);
}
