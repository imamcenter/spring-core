package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.service.MerchantService;
import tentang.tech.springcore.service.impl.MerchantServiceImpl;

public class InheritanceTest {
  private ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);

  }

  @Test
  void testInheritance() {

    MerchantService merchantService = context.getBean(MerchantService.class);
    MerchantServiceImpl merchantServiceImpl = context.getBean(MerchantServiceImpl.class);

    Assertions.assertSame(merchantService, merchantServiceImpl);
  }
}
