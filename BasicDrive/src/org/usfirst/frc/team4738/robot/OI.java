package org.usfirst.frc.team4738.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	Joystick Driver = new Joystick(RobotMap.Joystick1);
	Joystick Driver2 = new Joystick(RobotMap.Joystick2);
	Joystick Operator = new Joystick(RobotMap.Operator);

	public OI() {

	}

	public Joystick getJoystick1() {
		return Driver;

	}

	public Joystick getJoystick2() {
		return Driver2;

	}

	public Joystick getJoystick3() {
		return Operator;

	}
}
