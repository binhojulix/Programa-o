package br.com.fabio.services.impl;

import br.com.fabio.framework.annotations.Component;
import br.com.fabio.services.UserService;



@Component
public class UserServiceImpl implements UserService {

	@Override
	public String getUserName() {
		return "username";
	}
}