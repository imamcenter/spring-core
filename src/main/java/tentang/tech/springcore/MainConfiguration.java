package tentang.tech.springcore;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tentang.tech.springcore.configuration.BarConfiguration;
import tentang.tech.springcore.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {

}
