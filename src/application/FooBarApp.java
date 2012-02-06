package application;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class FooBarApp implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println(4+6);
		return null;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
