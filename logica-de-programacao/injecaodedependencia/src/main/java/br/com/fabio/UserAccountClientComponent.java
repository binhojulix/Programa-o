package br.com.fabio;

import br.com.fabio.framework.annotations.Autowired;
import br.com.fabio.framework.annotations.Component;
import br.com.fabio.framework.annotations.Qualifier;
import br.com.fabio.services.AccountService;
import br.com.fabio.services.UserService;

@Component

public class UserAccountClientComponent {
	@Autowired
	private UserService userService;
	
	@Autowired
	@Qualifier(value = "accountServiceImpl")
	private AccountService accountService;
	
	public void displayUserAccount() {
		String username = userService.getUserName();
		Long accountNumber = accountService.getAccountNumber(username);
		System.out.println("\n\tUser Name: " + username + "\n\tAccount Number: " + accountNumber);
	}
}
