package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.data.Bar;
import tentang.tech.springcore.data.Foo;

public class DuplicateBeanTest {

  @Test
  void testDuplicate() {
    ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
    Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
      Foo bean = context.getBean(Foo.class);

    });

  }


  @Test
  void testGetBean() {
    ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

    Foo foo1 = context.getBean("foo1", Foo.class);
    Foo foo2 = context.getBean("foo2", Foo.class);
  }

}
