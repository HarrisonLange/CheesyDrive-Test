package org.usfirst.frc.team4738.robot;

import edu.wpi.first.wpilibj.Spark;

public class RobotMap {

	public static final int
	// Motors
		Drive_Left = 0, Drive_Right = 1, Lift = 2, Climber = 3,
	// Controls
		Joystick1 = 0, Operator = 1;
	public static final double DeadZone = 0.05;
	
	public static Spark left = new Spark(RobotMap.Drive_Left);
	public static Spark right = new Spark(RobotMap.Drive_Right);
	public static Spark LiftD = new Spark(RobotMap.Lift);
}
