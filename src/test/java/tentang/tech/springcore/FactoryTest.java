package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.client.PaymentGatewayClient;

public class FactoryTest {
  private ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);

  }

  @Test
  void testFactory() {
    PaymentGatewayClient paymentGatewayClient = context.getBean(PaymentGatewayClient.class);
    Assertions.assertNotNull(paymentGatewayClient);
    Assertions.assertSame("http://example.com", paymentGatewayClient.getEndpoint());
    Assertions.assertSame("private", paymentGatewayClient.getPrivateKey());
    Assertions.assertSame("public", paymentGatewayClient.getPublicKey());
  }
}
