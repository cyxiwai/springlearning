package xiwai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("xiwai")
@EnableAspectJAutoProxy
public class SpringConfig {
}
