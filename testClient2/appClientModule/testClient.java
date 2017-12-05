import java.io.IOException;
import com.sun.jersey.api.client.Client;
import javax.naming.*;


public class testClient {

	public static void main(String[] args) throws NamingException, IOException {
		
		//Client client = Client.create();
		
		/*InitialContext ctx = new InitialContext();
		
		HelloRemote hello =  (HelloRemote) ctx.lookup("ejb:Test/TestEJB/Hello!test.HelloRemote");
		
		System.out.println("With RemoteInterface " + hello.getWelcome());*/
		

		// Möglicher EJB Aufruf
		/*URL url = new URL("http://localhost:8080/Rest/rest/welcome/get");
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "text/plain");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				http.getInputStream()));
				String line = reader.readLine();
				while (line != null) {
				System.out.println(line);
				line = reader.readLine();
				}
				reader.close();*/
		
		//InitialContext ctx = new InitialContext();
		//HelloRemote h = (HelloRemote) ctx.lookup("ejb:global/Test/TestEJB/Hello!" + test.HelloRemote.class.getName());
		
		System.out.println("Rest - " + Client.create().resource("http://localhost:8080/Rest/rest/welcome/get").get(String.class));
		//System.out.println("EJB - " + h.getWelcome());
	}
}