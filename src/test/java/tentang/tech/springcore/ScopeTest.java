package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.data.Foo;

public class ScopeTest {


  private ApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
  }

  @Test
  void testScope() {
    Foo foo = context.getBean(Foo.class);
    Foo foo1 = context.getBean(Foo.class);

    Assertions.assertNotSame(foo,foo1);
  }
}
