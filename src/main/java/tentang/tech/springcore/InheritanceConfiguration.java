package tentang.tech.springcore;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tentang.tech.springcore.service.impl.MerchantServiceImpl;

@Configuration
@Import(value = MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
