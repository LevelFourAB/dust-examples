package se.l4.dust.example.simple.pages;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import se.l4.dust.api.annotation.Template;

/**
 * Example page that can be accessed from the root of the server. Takes an
 * optional query parameter with a name ({@code ?name=Test}).
 * 
 * @author Andreas Holstenson
 *
 */
@Path("/")
@Template
public class ExamplePage
{
	private String name;

	@GET
	public ExamplePage get(@QueryParam("name") @DefaultValue("Cookie Monster") String name)
	{
		this.name = name;
		
		return this;
	}
	
	public String getName()
	{
		return name;
	}
}
