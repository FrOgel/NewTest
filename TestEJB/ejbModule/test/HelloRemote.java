package test;

import javax.ejb.Remote;

@Remote
public interface HelloRemote {
	
	public String getWelcome();

}
