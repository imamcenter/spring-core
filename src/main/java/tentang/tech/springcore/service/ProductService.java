package tentang.tech.springcore.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import tentang.tech.springcore.repository.ProductRepository;

@Component
public class ProductService {

  @Getter
  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public ProductService(ProductRepository productRepository, String name) {
    this.productRepository = productRepository;
  }
}
