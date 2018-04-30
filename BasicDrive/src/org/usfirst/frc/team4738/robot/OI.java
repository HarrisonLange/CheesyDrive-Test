package org.usfirst.frc.team4738.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	public Joystick Driver = new Joystick(RobotMap.Joystick1);
	//public Joystick Driver2 = new Joystick(RobotMap.Joystick2);
	public Joystick Operator = new Joystick(RobotMap.Operator);

	public double X = Driver.getRawAxis(1);
	public double Y = Driver.getRawAxis(2);

	
	public OI() {

	}

	public Joystick getJoystick1() {
		return Driver;

	}

	//public Joystick getJoystick2() {
		//return Driver2;

	//}

	public Joystick getJoystick3() {
		return Operator;

	}
}
