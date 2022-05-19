package com.clinicacliente.lifecicle;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebuggerListener implements javax.faces.event.PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Logger log=LogManager.getRootLogger();
	
	@Override
	public void beforePhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		//Revisar a que nivel esta la configuracion de LOG4J
		if(log.isInfoEnabled()) {
			log.info("Antes de la fase: "+ event.getPhaseId().toString());
		}
	}
	
	@Override
	public void afterPhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		if(log.isInfoEnabled()) {
			log.info("Despues de la fase"+event.getPhaseId().toString());
		}
	}


	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}

}
