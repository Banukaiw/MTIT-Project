package studentregistersubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

//import servicepublisher.ServicePublish;
import studentregisterpublisher.RegisterPublish;

public class SubscribeActivator implements BundleActivator {
	
	ServiceReference serviceReference;
	String registerNum = null;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Student Register Subscriber Start");
		System.out.println("\n");
		
		System.out.println("************  WELCOME To The SQA Institute  *************\n");
		serviceReference = context.getServiceReference(RegisterPublish.class.getName());
		
		RegisterPublish servicePublish = (RegisterPublish) context.getService(serviceReference);
		/* System.out.println(servicePublish.publishService()); */
		
		
		while(true) {
			
			
			
			System.out.println("Enter the Student Registration number:");
			registerNum = sc.nextLine();
			
			if(registerNum.length()==0) {
				break;
			}
			
			System.out.println(servicePublish.publishService(registerNum));
			
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Student Register Subscriber stop");
		System.out.println("Good Bye  !!!");
		context.ungetService(serviceReference);
	}

}
