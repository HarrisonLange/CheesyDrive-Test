package org.usfirst.frc.team4738.robot;
//All of the ports and controllers are setup in the RobotMap
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;

public class RobotMap {

	//This is all of the ports
	public static final int
	//Pneumatics
		//Compressor
		Compressor = 0, 
		//Solenoid Value (Open)
		POpen = 1, 
		//Solenoid Value (Close)
		PClose = 2, 
		//Solenoid Value (Kick)
		PKick = 3,
	// Motors
		//Left Motor Controller
		Drive_Left = 2, 
		//Right Motor Controller
		Drive_Right = 3, 
		//Lift Motor Controller
		Lift = 1, 
		//Climber Motor Controller
		Climber = 0,
	// Controls
		Joystick1 = 0,
	//Joystick 1 Axis
		//Robot Speed X
		ForwardA = 1, 
		//Robot Turning y
		TurnA = 5, 
		//Lift up
		LiftUA = 3, 
		//Lift Down
		LiftDA = 4,
	//Joystick 1 Buttons
		//Quickturn
		QuickTurnB = 1, 
		//Intake Open
		OpenB = 2;
	
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
