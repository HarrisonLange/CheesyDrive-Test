package org.usfirst.frc.team4738.robot.commands;

import org.usfirst.frc.team4738.robot.Robot;
import org.usfirst.frc.team4738.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Lift_C extends Command {

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		Robot.Lift.Lift(Robot.m_oi.getJoystick1().getRawAxis(RobotMap.LiftUA));

	}

	@Override
	protected void end() {
		Robot.Lift.Stop();
	}

	@Override
	protected boolean isFinished() {

		return false;
	}

}
