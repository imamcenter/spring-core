package tentang.tech.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tentang.tech.springcore.data.Foo;

@Configuration
public class PrimaryBeanConfiguration {

  @Primary
  @Bean
  public Foo foo1() {
    Foo foo = new Foo();
    return foo;
  }

  @Bean
  public Foo foo2() {
    Foo foo = new Foo();
    return foo;
  }
}
