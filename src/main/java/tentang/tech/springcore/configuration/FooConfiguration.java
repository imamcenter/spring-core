package tentang.tech.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tentang.tech.springcore.data.Bar;
import tentang.tech.springcore.data.Foo;

@Configuration
public class FooConfiguration {

  @Bean
  public Foo foo() {
    return new Foo();
  }
}
