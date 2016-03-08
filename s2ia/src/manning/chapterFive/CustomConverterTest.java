package manning.chapterFive;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import manning.chapterFive.utils.PortfolioService;
import manning.chapterFive.utils.Circle;
import manning.chapterFive.utils.Struts2PortfolioConstants;

import com.opensymphony.xwork2.ActionSupport;

/*
 *	This action serves to demo the many styles of configuring JavaBeans properties
 *	to receive data from the OGNL expressions in our forms.  
 */

public class CustomConverterTest extends ActionSupport {




	public String execute(){
		
		System.out.println("Circle = " + circle.getRadius() );
		
		return SUCCESS;
	}
	
	
	/* Circle Property */
	
	private Circle circle;
		
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle= circle;
	}	
	
	
}
