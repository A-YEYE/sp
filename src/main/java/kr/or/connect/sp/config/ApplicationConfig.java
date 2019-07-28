package kr.or.connect.sp.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages= {"kr.or.connect.sp.dao", "kr.or.connect.sp.service"})
@Import(DBConfig.class)
public class ApplicationConfig {

}
