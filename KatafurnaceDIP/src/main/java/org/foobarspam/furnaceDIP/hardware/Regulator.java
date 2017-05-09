package org.foobarspam.furnaceDIP.hardware;

import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Regulate;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.inyector.Force;
import org.foobarspam.furnaceDIP.types.RegulatorDisplayCodes;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Inject;


public class Regulator implements Regulate{
	
	private Thermometer t ;
	private Heater h;
	private double minTemp;
	private double maxTemp;
	private RoomTemperature temperature;
	private RegulatorDisplayCodes code;
	
	
	@Inject
	public void Regulador(Thermometer thermometer, @Force Heater heater){
		this.t = thermometer;
		this.h = heater;
	}
	@Inject
	public void setRoomTeperature(RoomTemperature roomTemperature){
		this.temperature = roomTemperature;
		
	}
	
	
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public void setCode(RegulatorDisplayCodes code) {
		this.code = code;
	}
	
	public void regulate(){
			while(t.read(temperature) < maxTemp){
				h.engage(temperature);
				code = RegulatorDisplayCodes.HEATING;
				message();
			}
			while (t.read(temperature) > minTemp){
				h.disengage(temperature);	
				code = RegulatorDisplayCodes.HEATING;
				message();
			}
	}
	
	public void message(){
		switch(code){
			case HEATING:
				System.out.println("Calentando => temperatura "+ temperature.getTemperature());
				break;
			case WAITING:
				System.out.println("Apagado => temperatura " + temperature.getTemperature());
				break;
			default:
				System.out.println("Algo raro sucede...");
				break;
		}
	}

	

}
