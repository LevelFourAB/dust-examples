package se.l4.dust.example.simple;

import se.l4.crayon.CrayonModule;
import se.l4.dust.api.NamespaceManager;
import se.l4.dust.api.annotation.NamespaceBinding;
import se.l4.dust.jaxrs.resteasy.ResteasyModule;

/**
 * Module that binds up the example namespace.
 * 
 * @author Andreas Holstenson
 *
 */
public class SimpleModule
	extends CrayonModule
{
	public static final String NAMESPACE = "dust:example";

	@Override
	protected void configure()
	{
		install(new ResteasyModule());
	}
	
	@NamespaceBinding
	public void bindNamespace(NamespaceManager manager)
	{
		manager.bind(NAMESPACE).add();
	}
}
