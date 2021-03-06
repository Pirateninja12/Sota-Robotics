package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.*;


/**
 *
 */
public class WinchLock extends Command {

    public WinchLock() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.manipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	SmartDashboard.putBoolean("1", RobotMap.intakearmSensor.get());
    	if (Robot.oi.gamepad1.getRawButton(6)){
    		
    		RobotMap.winchMotor.set(1);
    	}
    	else if (RobotMap.intakearmStop.get() == true && Robot.oi.gamepad1.getRawButton(5)){
    			
    			RobotMap.winchMotor.set(1);
    	}
    	else if (RobotMap.intakearmStop.get() == false && Robot.oi.gamepad1.getRawButton(5)){
    			
    			RobotMap.winchMotor.set(-1);
    	}
    	else{
    		RobotMap.winchMotor.set(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
