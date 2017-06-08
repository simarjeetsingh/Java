package org.foobarspam.proxyPattern.mrMeeseeks;

import java.util.ArrayList;

public class ProxyMrMeeseeks {
	
	private MrMeeseeks mrMe;
	
	private ArrayList<MrMeeseeks> meeseeks = new ArrayList<MrMeeseeks>();
	
	public ProxyMrMeeseeks(){
		
	}
	
	public MrMeeseeks getMrMe() {
		return mrMe;
	}


	public void createMrMeeseeks(ArrayList<MrMeeseeks> meeseeks){
		MrMeeseeks mrMe = new MrMeeseeks();
		mrMe.sayMessageOnCreate();
		meeseeks.add(mrMe);
		
	}
	
	public void pushButton(ArrayList<MrMeeseeks> meeseeks){	
		createMrMeeseeks(meeseeks);	
				
	}
}
