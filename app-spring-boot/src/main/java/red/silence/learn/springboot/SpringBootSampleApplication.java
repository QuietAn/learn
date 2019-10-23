package red.silence.learn.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootSampleApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootSampleApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		logger.debug("outside web server");
		return builder.sources(this.getClass());

	}
}
