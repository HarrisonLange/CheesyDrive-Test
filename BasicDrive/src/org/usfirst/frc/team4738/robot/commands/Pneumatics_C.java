package org.usfirst.frc.team4738.robot.commands;


import org.usfirst.frc.team4738.robot.RobotMap;
import org.usfirst.frc.team4738.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Pneumatics_C extends Command {
	

	@Override
	protected void initialize() {
		RobotMap.aCompressor.setClosedLoopControl(true);
		RobotMap.Open.set(false);
		RobotMap.Close.set(true);
	}
	@Override
	protected void execute() {
		while(Robot.m_oi.Driver.getRawButton(1) == true) {
			RobotMap.Open.set(true);
		}
		RobotMap.Open.set(false);
		RobotMap.Close.set(true);
	}

	@Override
	protected void end() {
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	

}
