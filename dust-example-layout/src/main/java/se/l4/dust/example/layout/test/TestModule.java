package se.l4.dust.example.layout.test;

import se.l4.crayon.CrayonModule;
import se.l4.dust.api.NamespaceManager;
import se.l4.dust.api.annotation.NamespaceBinding;
import se.l4.dust.example.layout.shared.SharedModule;

public class TestModule
	extends CrayonModule
{
	public static final String NAMESPACE = "dust:example:test";

	@Override
	protected void configure()
	{
		install(new SharedModule());
	}
	
	@NamespaceBinding
	public void bindNamespace(NamespaceManager manager)
	{
		manager.bind(NAMESPACE).add();
	}
}
