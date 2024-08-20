package org.samsung.ktra.repositories;

import org.samsung.ktra.repositories.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    public List<Product> getDummyProducts()
    {
        List<Product> lstProduct= new ArrayList<>();
        lstProduct.add(
                Product.builder()
                        .id(1l)
                        .name("Sneakers for Women Running Shoes")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/81kvvmH31SL._SR200,200_.jpg")
                        .price(821000L).build());

        lstProduct.add(
                Product.builder()
                        .id(2l)
                        .name("Women's Navida Sneaker")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/71dr3ma507L._SR200,200_.jpg")
                        .price(1423770L).build());

        lstProduct.add(
                Product.builder()
                        .id(3l)
                        .name("Men's Charged Assert 10")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/61O30g0cZmL._SR200,200_.jpg")
                        .price(2352000L).build());

        lstProduct.add(
                Product.builder()
                        .id(4l)
                        .name("Women's Uno- Stand On Air Sneaker")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/71ArFp7g5bL._SR200,200_.jpg")
                        .price(2171000L).build());

        return lstProduct;
    }

    public Product getProductById(Long id)
    {
        List<Product> lstProducts = this.getDummyProducts();
        return lstProducts.stream().filter(p->p.getId() == id).findFirst().get();
    }

   
}