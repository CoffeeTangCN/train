package chances.demo.jpa.config;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.validation.Validator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;

import chances.demo.jpa.entity.Role;
import chances.demo.jpa.entity.User;

@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
public class RestMvConfiguration  extends RepositoryRestConfigurerAdapter{
	private  final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	public void configureJacksonObjectMapper(ObjectMapper objectMapper) {
		SerializationConfig serializationConfig = objectMapper.getSerializationConfig().with(df);
		
		objectMapper.setConfig(serializationConfig);
	}
	
	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
		super.configureValidatingRepositoryEventListener(validatingListener);
		Validator validator = new BeforeSaveValidator();
		validatingListener.addValidator("beforeSave", validator );
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		super.configureRepositoryRestConfiguration(config);
		config.exposeIdsFor(User.class,Role.class);
	}

}
