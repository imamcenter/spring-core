package tentang.tech.springcore.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import tentang.tech.springcore.client.PaymentGatewayClient;

@Component(value = "paymentGatewayFactory")
public class PaymentGatewayFactoryBean implements FactoryBean<PaymentGatewayClient> {


  @Override
  public PaymentGatewayClient getObject() throws Exception {
    PaymentGatewayClient client = new PaymentGatewayClient();
    client.setEndpoint("http://example.com");
    client.setPrivateKey("private");
    client.setPublicKey("public");

    return client;
  }

  @Override
  public Class<?> getObjectType() {
    return PaymentGatewayClient.class;
  }
}
