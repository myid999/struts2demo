package manning.chapterEight;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import manning.chapterEight.utils.PortfolioService;
import manning.chapterEight.utils.User;
import manning.chapterEight.utils.Struts2PortfolioConstants;

import com.opensymphony.xwork2.ActionSupport;

/*
 *
 */

public class RetrieveUser extends ActionSupport  {

	public String execute(){
		
		User user = getPortfolioService().getUser( getUsername() );
		setJsonModel(user);
		
		return SUCCESS;
	}
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	private Object jsonModel;
	
	public Object getJsonModel() {
		return jsonModel;
	}


	public void setJsonModel(Object jsonModel) {
		this.jsonModel = jsonModel;
	}

	
	/*  
	 * Simple way to retrieve our business logic and data peristence
	 * object.  Late versions of the portfolio app will intergrate with
	 * more sophisticated technologies for these services.
	 */
	public PortfolioService getPortfolioService( ) 	{
		
		return new PortfolioService();
		
	}
	

}
