package test;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Hello
 */
@Stateless
public class Hello implements HelloRemote {

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }
    
	public String getWelcome() {
		// TODO Auto-generated method stub
		return "Hallo vom EJB";
	}

    
}
