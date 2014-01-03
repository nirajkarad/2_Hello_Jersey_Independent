package ning.codelab.hello;

import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

/**
 * This is the root module for the Hello server. It will install other modules
 * and configure what is needed for the hello core. See
 * <a href=http://code.google.com/p/google-guice/>http://code.google.com/p/google-guice/</a>
 * for more information on Google Guice.
 */
public class HelloServerModule extends ServletModule
{
    protected void configureServlets()
    {
    	
    	bind(MyConfig.class).toProvider(ConfigProvider.class);

        serve("*").with(GuiceContainer.class);

        bind(HelloResource.class).asEagerSingleton();
    }
}
