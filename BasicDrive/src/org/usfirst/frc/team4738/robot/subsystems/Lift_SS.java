package org.usfirst.frc.team4738.robot.subsystems;

import org.usfirst.frc.team4738.robot.Robot;
import org.usfirst.frc.team4738.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Lift_SS extends Subsystem {

	private Spark Lift = new Spark(RobotMap.Lift);
	private DifferentialDrive LiftDrive = new DifferentialDrive(Lift, null);
	@Override
	protected void initDefaultCommand() {
		
		
	}
	public void Lift(Joystick Operator) {
		double liftSpeed=0;
		liftSpeed = Robot.m_oi.getJoystick1().getX();
		LiftDrive.tankDrive(liftSpeed, 0);
		
	}
	public void intake() {
		
	}
	public void Stop() {
		Lift.set(0);
	}
}
