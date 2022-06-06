1. @SpringBootApplication
这里先单独拎出@SpringBootApplication 注解说一下，虽然我们一般不会主动去使用它。

Guide 哥：这个注解是 Spring Boot 项目的基石，创建 SpringBoot 项目之后会默认在主类加上。

@SpringBootApplication
public class SpringSecurityJwtGuideApplication {
      public static void main(java.lang.String[] args) {
        SpringApplication.run(SpringSecurityJwtGuideApplication.class, args);
    }
}
我们可以把 @SpringBootApplication看作是 @Configuration、@EnableAutoConfiguration、@ComponentScan 注解的集合。