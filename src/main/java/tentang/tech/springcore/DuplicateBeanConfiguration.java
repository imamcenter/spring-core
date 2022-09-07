package tentang.tech.springcore;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tentang.tech.springcore.data.Foo;

@Slf4j
@Configuration
public class DuplicateBeanConfiguration {


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
