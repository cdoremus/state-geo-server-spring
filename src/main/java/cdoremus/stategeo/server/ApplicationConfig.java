package cdoremus.stategeo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mongodb.Mongo;


@Configuration
//@EnableWebMvc
@EnableMongoRepositories
@EnableAutoConfiguration
@ComponentScan
@PropertySource("classpath:dev.properties")
class ApplicationConfig extends AbstractMongoConfiguration {

	
	@Override
	protected String getDatabaseName() {
		return "states";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new Mongo("localhost");
	}

	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public static void main(String[] args){
		SpringApplication.run(ApplicationConfig.class, args);
	}
}
