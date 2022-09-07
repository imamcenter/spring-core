package tentang.tech.springcore;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tentang.tech.springcore.data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {

  @Bean
  public Foo foo() {
    Foo foo = new Foo();
    log.info("create new foo");
    return foo;
  }
}
