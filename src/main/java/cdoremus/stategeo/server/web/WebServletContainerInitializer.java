package cdoremus.stategeo.server.web;

import javax.servlet.ServletContainerInitializer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import cdoremus.stategeo.server.Application;

/**
 * 
 * {@link ServletContainerInitializer} for configuration options since web.xml 
 * is not used in this application.
 *
 */
public class WebServletContainerInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
}
