package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.data.Foo;
import tentang.tech.springcore.data.FooBar;

public class OptionalTest {

  @Test
  void testOptional() {
    ApplicationContext context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
    Foo foo = context.getBean(Foo.class);
    FooBar fooBar = context.getBean(FooBar.class);

    Assertions.assertNull(fooBar.getBar());
    Assertions.assertSame(foo, fooBar.getFoo());
  }
}
