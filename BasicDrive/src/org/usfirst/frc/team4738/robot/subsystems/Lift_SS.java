package org.usfirst.frc.team4738.robot.subsystems;

import org.usfirst.frc.team4738.robot.Robot;
import org.usfirst.frc.team4738.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Lift_SS extends Subsystem {

	
	private DifferentialDrive LiftDrive = new DifferentialDrive(RobotMap.LiftD, null);

	@Override
	protected void initDefaultCommand() {

	}

	public void Lift(double d) {
		double liftSpeed = 0;
		liftSpeed = (Robot.m_oi.getJoystick1().getRawAxis(RobotMap.LiftUA) - Robot.m_oi.getJoystick1().getRawAxis(RobotMap.LiftDA));
		LiftDrive.tankDrive(liftSpeed, 0);

	}


	public void Stop() {
		RobotMap.LiftD.set(0);
	}
}
