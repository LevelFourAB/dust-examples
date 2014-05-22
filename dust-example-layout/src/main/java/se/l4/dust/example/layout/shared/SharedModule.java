package se.l4.dust.example.layout.shared;

import se.l4.crayon.CrayonModule;
import se.l4.dust.api.NamespaceManager;
import se.l4.dust.api.annotation.NamespaceBinding;
import se.l4.dust.jaxrs.resteasy.ResteasyModule;

public class SharedModule
	extends CrayonModule
{
	public static final String NAMESPACE = "dust:example:shared";

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
