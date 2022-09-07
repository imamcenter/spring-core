package tentang.tech.springcore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import tentang.tech.springcore.data.Foo;

@Slf4j
@Configuration
public class ScopeConfiguration {

  @Bean
  @Scope(value = "prototype")
  public Foo foo() {
    Foo foo = new Foo();
    log.info("create new foo");
    return foo;
  }
}
