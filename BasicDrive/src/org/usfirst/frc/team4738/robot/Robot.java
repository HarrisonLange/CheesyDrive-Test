package org.usfirst.frc.team4738.robot;
//All of the ports and controllers are setup in the RobotMap
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.usfirst.frc.team4738.robot.subsystems.DriveTrain_SS;
import org.usfirst.frc.team4738.robot.subsystems.Lift_SS;

public class Robot extends TimedRobot {
	public static OI m_oi;
	public static DriveTrain_SS DriveTrain = new DriveTrain_SS();
	public static Lift_SS Lift = new Lift_SS();

	@Override
	public void robotInit() {
		m_oi = new OI();
	}

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
	}
}
