package studentregisterpublisher;

import java.util.ArrayList;

public class RegisterPublishImpl implements RegisterPublish {
	
	@Override
	public String publishService(String Idno) {
		ArrayList<String> RegisterList = new ArrayList<String>();
		RegisterList.add("IT1111");
		RegisterList.add("IT2222");
		RegisterList.add("IT3333");
		RegisterList.add("IT4444");
		RegisterList.add("IT5555");
		RegisterList.add("BM3333");
		RegisterList.add("BM5555");
		
	
	if (RegisterList.contains(Idno)) {
		return       Idno +" is current semester registed ...!!!\n";
		
	}
	else {
		
		
		return "Unregisted or Invalid Register Number..!!!\n";
		
	}
	}
		
}

