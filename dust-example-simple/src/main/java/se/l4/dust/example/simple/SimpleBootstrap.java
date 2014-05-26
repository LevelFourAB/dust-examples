package se.l4.dust.example.simple;

import se.l4.crayon.Configurator;
import se.l4.dust.servlet.AppBootstrap;

public class SimpleBootstrap
	extends AppBootstrap
{

	@Override
	protected void initialize(Configurator configurator)
	{
		configurator.add(SimpleModule.class);
	}

}
