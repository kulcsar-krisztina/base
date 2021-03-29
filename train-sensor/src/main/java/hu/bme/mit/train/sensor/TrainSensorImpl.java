package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private TrainUser user;
	private int speedLimit = 5;
	private boolean alarmstate;

	public TrainSensorImpl(TrainController controller, TrainUser user) {
		this.controller = controller;
		this.user = user;
	}

	@Override
	public boolean getAlarmState() {
		return alarmstate;
	}

	@Override
	public void setAlarmState(boolean alarmState) {
		this.alarmstate = alarmState;
	}

	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}

	@Override
	public void overrideSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
		controller.setSpeedLimit(speedLimit);

		if(speedLimit > 0 && speedLimit < 500) {
			this.setAlarmState(false);
		}
		else {
			this.setAlarmState(true);
			return;
		}
		if(speedLimit > controller.getReferenceSpeed() * 0.5) {
			this.setAlarmState(false);
		}
		else {
			this.setAlarmState(true);
		}
	}

}
