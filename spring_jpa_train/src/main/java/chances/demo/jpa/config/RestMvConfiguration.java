package chances.demo.jpa.config;

import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
public class RestMvConfiguration {

}
