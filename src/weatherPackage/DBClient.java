package weatherPackage;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

//Reference: http://www.mkyong.com/webservices/jax-rs/restful-java-client-with-jersey-client/
public class DBClient {
	
	public String clientFunc(String city) {
		
		Client client = Client.create();
		WebResource webResource = client
				   .resource("http://localhost:7070/weatherProject/rest/server/service").queryParam("city",city);

				ClientResponse response = webResource.accept(MediaType.TEXT_PLAIN)
		                   .get(ClientResponse.class);

				if (response.getStatus() != 200) {
				   throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
				}
				
				
				String output = response.getEntity(String.class);

			//	System.out.println("Output from Server .... \n");
				
			//	System.out.println(output);
				
				
				return output;
				
			}
	
	
	public static void main(String[] args){
	
		
}
		
}		
	/*
	DBServer db = new DBServer();
	System.out.println("DBClient ???????????");
	Client client = Client.create();
	WebResource webresource = client.resource("http://localhost:8080/servletPage/rest/server/{city}");
	List<DBWeather> dblist = db.getList();
	dblist = webresource.get(new GenericType<List<DBWeather>>(){});
	Response.ok().entity(dblist.toString()).build();
	*/

