package hello.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core",    // 경로를 지정해주지않으면 해당 클래스의 패키지를 기준으로 탐색함
                                        // 왜 안되나 했네, 하지만 권장은 프로젝트 최상단에두고 따로 base 경로를 지정해주지 않는것
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))
public class AutoAppConfig {
}
