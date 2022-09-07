package tentang.tech.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tentang.tech.springcore.data.Bar;

@Configuration
public class BarConfiguration {

  @Bean
  public Bar bar() {
    return new Bar();
  }
}
