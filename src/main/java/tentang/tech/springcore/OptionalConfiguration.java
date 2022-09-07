package tentang.tech.springcore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tentang.tech.springcore.data.Bar;
import tentang.tech.springcore.data.Foo;
import tentang.tech.springcore.data.FooBar;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {


  @Bean
  public Foo foo() {
    return new Foo();
  }

  @Bean
  public FooBar bar(Optional<Foo> foo, Optional<Bar> bar) {
    return new FooBar(foo.orElse(null), bar.orElse(null));
  }
}
