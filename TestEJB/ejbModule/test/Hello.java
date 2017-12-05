package test;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Session Bean implementation class Hello
 */
@Stateless
@Remote
@Path("/EJB")
public class Hello implements HelloRemote {

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("getEJB")
    public String getEJBWelcome() {
    	return "Hello from REST EJB";
    }
    
	public String getWelcome() {
		// TODO Auto-generated method stub
		return "Hallo vom EJB";
		
	}

    
}
