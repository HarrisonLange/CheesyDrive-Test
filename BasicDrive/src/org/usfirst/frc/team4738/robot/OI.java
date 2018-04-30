/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

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
