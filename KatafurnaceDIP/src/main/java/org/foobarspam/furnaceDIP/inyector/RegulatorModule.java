package org.foobarspam.furnaceDIP.inyector;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.otherstuff.Jedi;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class RegulatorModule extends AbstractModule{
	 @Override 
	  protected void configure() {
		 bind(Heater.class).to(GasHeater.class);
		// para seleccionar el tipo de servicio mediante BindingAnnotation:
		 bind(Heater.class).annotatedWith(Force.class).to(Jedi.class);
		 bind(Thermometer.class).to(RemoteCommandSensor.class);
	  }
	 @Provides
	 RoomTemperature provideRoomTemperature() {
	 RoomTemperature roomTemperature = new RoomTemperature();
	 // movemos la configuracion del objeto desde el main a este modulo
	 roomTemperature.setTemperature(15);
	 return roomTemperature;
	 }
}
