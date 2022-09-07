package tentang.tech.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tentang.tech.springcore.data.Foo;

@Configuration
public class BeanNameConfiguration {

  @Primary
  @Bean(value = "fooFirst")
  public Foo foo1() {
    Foo foo = new Foo();
    return foo;
  }

  @Bean(value = "fooSecond")
  public Foo foo2() {
    Foo foo = new Foo();
    return foo;
  }
}
