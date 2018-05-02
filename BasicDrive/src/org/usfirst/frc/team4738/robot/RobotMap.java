package org.usfirst.frc.team4738.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;

public class RobotMap {

	//This is all of the ports
	public static final int
	//Pneumatics
		Compressor = 0, POpen = 1, PClose = 2, PKick = 3,
	// Motors
		Drive_Left = 0, Drive_Right = 1, Lift = 2, Climber = 3,
	// Controls
		Joystick1 = 0, Operator = 1;
	
	//Veriables
	public static final double DeadZone = 0.05;
	//Motor Controllers
	public static Spark left = new Spark(RobotMap.Drive_Left);
	public static Spark right = new Spark(RobotMap.Drive_Right);
	public static Spark LiftD = new Spark(RobotMap.Lift);
	//Pneumatics
	public static Compressor aCompressor = new Compressor(Compressor);
	public static Solenoid Open = new Solenoid(POpen);
	public static Solenoid Close = new Solenoid(PClose);
	public static Solenoid Kick = new Solenoid(PKick);
	
}
