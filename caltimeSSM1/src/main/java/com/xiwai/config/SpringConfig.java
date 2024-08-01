package com.xiwai.config;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.xiwai"})
@EnableAspectJAutoProxy
@PropertySource("jdbc.properties")
@Import({jdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
