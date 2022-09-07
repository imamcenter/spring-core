package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.repository.CategoryRepository;
import tentang.tech.springcore.repository.CustomerRepository;
import tentang.tech.springcore.repository.ProductRepository;
import tentang.tech.springcore.service.CategoryService;
import tentang.tech.springcore.service.CustomerService;
import tentang.tech.springcore.service.ProductService;

public class ComponentTest {
  //  private ConfigurableApplicationContext context;
  private ApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
//    context.registerShutdownHook();
  }

  @Test
  void testComponent() {

    ProductService bean = context.getBean(ProductService.class);
    ProductService bean1 = context.getBean("productService", ProductService.class);
  }

  @Test
  void testConstructorDependencyInjection() {
    ProductService productService = context.getBean(ProductService.class);
    ProductRepository productRepository = context.getBean(ProductRepository.class);

    Assertions.assertSame(productRepository, productService.getProductRepository());
  }


  @Test
  void testSetterDependencyInjection() {
    CategoryService categoryService = context.getBean(CategoryService.class);
    CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);

    Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
  }

  @Test
  void testFieldDependencyInjection() {
    CustomerService customerService = context.getBean(CustomerService.class);
    CustomerRepository normalCustomerRepository = context.getBean("normalCustomerRepository",CustomerRepository.class);
    CustomerRepository premiumCustomerRepository = context.getBean("premiumCustomerRepository",CustomerRepository.class);
    Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
    Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
  }

}
