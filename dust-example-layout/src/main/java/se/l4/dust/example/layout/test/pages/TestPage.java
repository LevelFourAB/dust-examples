package se.l4.dust.example.layout.test.pages;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import se.l4.dust.api.annotation.Template;

@Path("/")
@Template
public class TestPage
{
	private String name;

	@GET
	public TestPage get(@QueryParam("name") @DefaultValue("Cookie Monster") String name)
	{
		this.name = name;
		
		return this;
	}
	
	public String getName()
	{
		return name;
	}
}
