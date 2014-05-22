package se.l4.dust.example.layout;

import se.l4.crayon.Configurator;
import se.l4.dust.example.layout.test.TestModule;
import se.l4.dust.jaxrs.AppBootstrap;

public class LayoutBootstrap
	extends AppBootstrap
{

	@Override
	protected void initialize(Configurator configurator)
	{
		configurator.add(TestModule.class);
	}

}
