package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularTest {

  @Test
  void test() {
    Assertions.assertThrows(Throwable.class, () -> {
      ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
    });
  }
}
