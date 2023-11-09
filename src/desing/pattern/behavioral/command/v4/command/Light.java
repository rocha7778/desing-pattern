package desing.pattern.behavioral.command.v4.command;

public class Light {

	private boolean switchedOn = false;
	
	public Light() {
	}

	public boolean isSwitchedOn() {
		return switchedOn;
	}

	public void setSwitchedOn() {
		this.switchedOn  = true;
	}
	
	public void setSwitchedOff() {
		this.switchedOn  = false;
	}

}
