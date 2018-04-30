package org.usfirst.frc.team4738.robot.subsystems;

import org.usfirst.frc.team4738.robot.Robot;
import org.usfirst.frc.team4738.robot.RobotMap;
import org.usfirst.frc.team4738.robot.commands.CheesyDrive_C;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain_SS extends Subsystem {
	Spark left = new Spark(RobotMap.Drive_Left);
	Spark right = new Spark(RobotMap.Drive_Right);
	private DifferentialDrive MainDrive = new DifferentialDrive(left, right);

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CheesyDrive_C());

	}

	public void TeleopDrive(double d, double e) {
		double xSpeed = 0;
		double yRotation = 0;
		boolean isQuickTurn = false;
		xSpeed = Robot.m_oi.getJoystick1().getRawAxis(1);
		yRotation = Robot.m_oi.getJoystick1().getRawAxis(5);
		MainDrive.curvatureDrive(xSpeed, yRotation, isQuickTurn);

	}

	public void Stop() {
		MainDrive.tankDrive(0, 0);
	}
}
