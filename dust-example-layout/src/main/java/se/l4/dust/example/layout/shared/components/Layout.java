package se.l4.dust.example.layout.shared.components;

import se.l4.dust.api.annotation.Component;
import se.l4.dust.api.annotation.PrepareRender;
import se.l4.dust.api.annotation.TemplateParam;

/**
 * Component that renders the layout.
 * 
 * @author Andreas Holstenson
 *
 */
@Component
public class Layout
{
	private String title;

	@PrepareRender
	public void prepare(@TemplateParam("title") String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
}
