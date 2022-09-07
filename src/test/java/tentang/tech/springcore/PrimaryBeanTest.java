package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.data.Foo;

public class PrimaryBeanTest {

  ApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(PrimaryBeanConfiguration.class);
  }

  @Test
  void testGetBean() {

    Foo foo = context.getBean(Foo.class);
    Foo foo1 = context.getBean("foo1", Foo.class);
    Foo foo2 = context.getBean("foo2", Foo.class);

  Assertions.assertSame(foo, foo1);
  Assertions.assertNotSame(foo1, foo2);
  Assertions.assertNotSame(foo, foo2);
  }
}
