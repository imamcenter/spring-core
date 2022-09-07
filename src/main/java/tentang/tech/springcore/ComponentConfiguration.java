package tentang.tech.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "tentang.tech.springcore.service",
    "tentang.tech.springcore.repository",
    "tentang.tech.springcore.configuration"
})
public class ComponentConfiguration {
}
