package org.usfirst.frc.team4738.robot.subsystems;

import org.usfirst.frc.team4738.robot.Robot;
import org.usfirst.frc.team4738.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Lift_SS extends Subsystem {

	
	private DifferentialDrive LiftDrive = new DifferentialDrive(RobotMap.LiftD, null);

	@Override
	protected void initDefaultCommand() {

	}

	public void Lift(Joystick Operator) {
		double liftSpeed = 0;
		liftSpeed = Robot.m_oi.getJoystick3().getX();
		LiftDrive.tankDrive(liftSpeed, 0);

	}

	public void intake() {

	}

	public void Stop() {
		RobotMap.LiftD.set(0);
	}
}
