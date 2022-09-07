package tentang.tech.springcore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import tentang.tech.springcore.data.Bar;
import tentang.tech.springcore.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {

  @Lazy
  @DependsOn(value = {"bar"})
  @Bean
  public Foo foo() {
    Foo foo = new Foo();
    log.info("create new foo");
    return foo;
  }

  @Bean
  public Bar bar() {
    log.info("create new bar");
    return new Bar();
  }
}
