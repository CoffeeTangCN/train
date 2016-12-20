package chances.demo.jpa.service;

import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

import chances.demo.jpa.entity.User;

@Component
public class BeforeSaveEventListener extends AbstractRepositoryEventListener<User> {
	@Override
	public void onBeforeSave(User entity) {
	}

	@Override
	public void onAfterDelete(User entity) {
	}
}
