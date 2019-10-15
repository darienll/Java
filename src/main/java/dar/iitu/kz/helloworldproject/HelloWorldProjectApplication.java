package dar.iitu.kz.helloworldproject;

import dar.iitu.kz.helloworldproject.models.TestModel;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MappedTypes(TestModel.class)
@MapperScan("dar.iit.kz.helloworldproject.mapper")
public class HelloWorldProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldProjectApplication.class, args);
	}

}
