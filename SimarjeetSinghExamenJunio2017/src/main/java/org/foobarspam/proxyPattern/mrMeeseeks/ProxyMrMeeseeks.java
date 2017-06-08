package org.foobarspam.proxyPattern.mrMeeseeks;

import java.util.ArrayList;

public class ProxyMrMeeseeks {
	
	private MrMeeseeks mrMe;
		
	
	public ProxyMrMeeseeks(){
		
	}
		
	public MrMeeseeks getMrMe() {
		return mrMe;
	}


	public void createMrMeeseeks(ArrayList<MrMeeseeks> setMrMe){
		mrMe = new MrMeeseeks();
		mrMe.sayMessageOnCreate();
		setMrMe.add(mrMe);
		
	}
	
	public void pushButton(ArrayList<MrMeeseeks> setMrMe){	
		createMrMeeseeks(setMrMe);				
	}
}
