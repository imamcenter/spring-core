package tentang.tech.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tentang.tech.springcore.data.Bar;
import tentang.tech.springcore.data.Foo;
import tentang.tech.springcore.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {
  @Primary
  @Bean
  public Foo foo() {
    return new Foo();
  }

  @Bean
  public Foo fooSecond() {
    return new Foo();
  }

  @Bean
  public Bar bar() {
    return new Bar();
  }

  @Bean
  public FooBar fooBar(@Qualifier(value = "fooSecond") Foo foo, Bar bar) {
    return new FooBar(foo, bar);
  }
}
