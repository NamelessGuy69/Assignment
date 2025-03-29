package login;

import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPassword(){
		
		logininfo.put("John", "Muhammad");
		logininfo.put("Eren", "Yeager");
		logininfo.put("Eve", "Leong");
	}
	
	@SuppressWarnings("rawtypes")
	protected HashMap getLoginInfo(){
		return logininfo;
	}	
}
