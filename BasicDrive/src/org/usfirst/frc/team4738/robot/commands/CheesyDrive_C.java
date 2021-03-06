package org.usfirst.frc.team4738.robot.commands;

import org.usfirst.frc.team4738.robot.Robot;
import org.usfirst.frc.team4738.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class CheesyDrive_C extends Command {

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		Robot.DriveTrain.TeleopDrive(Robot.m_oi.getJoystick1().getRawAxis(RobotMap.ForwardA), Robot.m_oi.getJoystick1().getRawAxis(RobotMap.TurnA));

	}

	@Override
	protected void end() {
		Robot.DriveTrain.Stop();
	}

	@Override
	protected boolean isFinished() {

		return false;
	}

}
