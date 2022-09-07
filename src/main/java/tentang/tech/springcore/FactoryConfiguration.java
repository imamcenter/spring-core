package tentang.tech.springcore;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tentang.tech.springcore.factory.PaymentGatewayFactoryBean;

@Configuration
@Import(value = PaymentGatewayFactoryBean.class)
public class FactoryConfiguration {
}
