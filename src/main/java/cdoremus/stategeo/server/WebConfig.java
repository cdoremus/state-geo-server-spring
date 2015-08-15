package cdoremus.stategeo.server;

//import org.eclipse.jetty.server.Handler;
//import org.eclipse.jetty.server.NCSARequestLog;
//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.server.handler.HandlerCollection;
//import org.eclipse.jetty.server.handler.RequestLogHandler;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
//import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
//import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry
	      .addResourceHandler("/**")
	      .addResourceLocations("/static/")
	      .setCachePeriod(3600)
	      .resourceChain(true)
	      .addResolver(new PathResourceResolver());
	}	

//	@Bean
//	public EmbeddedServletContainerFactory jettyConfigBean() {
//	    JettyEmbeddedServletContainerFactory jef = new JettyEmbeddedServletContainerFactory();
//	    jef.addServerCustomizers(new JettyServerCustomizer() {
//	        public void customize(Server server) {
//	            HandlerCollection handlers = new HandlerCollection();
//	            for (Handler handler : server.getHandlers()) {
//	                handlers.addHandler(handler);
//	            }
//	            RequestLogHandler reqLogs = new RequestLogHandler();
//	            NCSARequestLog reqLogImpl = new NCSARequestLog("./logs/access-yyyy_mm_dd.log");
//	            reqLogImpl.setRetainDays(30);
//	            reqLogImpl.setAppend(true);
//	            reqLogImpl.setExtended(false);
////	            reqLogImpl.setLogTimeZone("GMT");
//	            reqLogImpl.setLogTimeZone("EST");
//	            reqLogs.setRequestLog(reqLogImpl);
//	            handlers.addHandler(reqLogs);
//	            server.setHandler(handlers);
//	        }
//	    });
//	    return jef;
//	}
}
