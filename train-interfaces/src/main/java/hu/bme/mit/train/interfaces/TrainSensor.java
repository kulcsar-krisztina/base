package hu.bme.mit.train.interfaces;

public interface TrainSensor {

	int getSpeedLimit();

	void overrideSpeedLimit(int speedLimit);

	public boolean getAlarmState();

	public void setAlarmState(boolean alarmState);

}
