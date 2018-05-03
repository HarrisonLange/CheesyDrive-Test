package org.usfirst.frc.team4738.robot.subsystems;

import org.usfirst.frc.team4738.robot.Robot;
import org.usfirst.frc.team4738.robot.RobotMap;
import org.usfirst.frc.team4738.robot.commands.CheesyDrive_C;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain_SS extends Subsystem {
	
	private DifferentialDrive MainDrive = new DifferentialDrive(RobotMap.left, RobotMap.right);

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CheesyDrive_C());

	}

	public void TeleopDrive(double d, double e) {
		double xSpeed = 0;
		double yRotation = 0;
		boolean isQuickTurn = false;
		isQuickTurn = Robot.m_oi.getJoystick1().getRawButton(RobotMap.QuickTurnB);
		xSpeed = Robot.m_oi.getJoystick1().getRawAxis(RobotMap.ForwardA);
		yRotation = Robot.m_oi.getJoystick1().getRawAxis(RobotMap.TurnA);
		MainDrive.curvatureDrive(xSpeed, yRotation, isQuickTurn);

	}

	public void Stop() {
		MainDrive.tankDrive(0, 0);
	}
}
