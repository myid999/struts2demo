package manning.chapterTen;


import java.util.Collection;
import java.util.List;
import java.util.Map;

import manning.utils.PortfolioServiceInterface;
import manning.utils.User;
import manning.utils.UserAware;



import com.opensymphony.xwork2.ActionSupport;

/*
 * This action retrieves the data model for building a select box of users.
 * This mostly consists of a list of the current user/accounts. 
 */

public class AjaxUserBrowser extends ActionSupport {
	
	public String execute(){
		Collection users =  getPortfolioService().getUsers();
		setUsers( users );
		
		String selectedUsername = getPortfolioService().getDefaultUser();
		setDefaultUser( getPortfolioService().getUser( selectedUsername ));
		
		
		return SUCCESS;
	}
	
	/* JavaBeans Properties to Receive Request Parameters */
	
	private Collection users;
	private User defaultUser;
	
	public Collection getUsers() {
		return users;
	}

	public void setUsers(Collection users) {
		this.users = users;
	}
	
	public User getDefaultUser() {
		return defaultUser;
	}

	public void setDefaultUser(User username) {
		this.defaultUser = username;
	}
	
	private PortfolioServiceInterface portfolioService;
	
	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
		
	}
	public void setPortfolioService( PortfolioServiceInterface portService){
		portfolioService = portService;
	}
	
	
	

}
