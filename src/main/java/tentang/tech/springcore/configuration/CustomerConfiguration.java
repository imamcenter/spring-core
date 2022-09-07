package tentang.tech.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tentang.tech.springcore.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {

  @Bean
  public CustomerRepository normalCustomerRepository() {
    return new CustomerRepository();
  }

  @Bean
  public CustomerRepository premiumCustomerRepository() {
    return new CustomerRepository();
  }
}
