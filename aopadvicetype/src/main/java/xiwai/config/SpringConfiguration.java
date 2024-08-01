package xiwai.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"xiwai.dao","xiwai.aspect"})
@EnableAspectJAutoProxy
public class SpringConfiguration {
}
