package studentregisterpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;
	
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
	@Override

	public void start(BundleContext context) throws Exception {
		System.out.println("Student Register Publisher started");
		RegisterPublish publisherService = new RegisterPublishImpl();
		publishServiceRegistration = context.registerService(
				RegisterPublish.class.getName(),publisherService,null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Student Register Publisher stoped");
		publishServiceRegistration.unregister();
	}

}
