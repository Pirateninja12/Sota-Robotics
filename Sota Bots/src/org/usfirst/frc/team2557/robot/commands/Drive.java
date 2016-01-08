package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {

    public Drive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveWithJoystick);
    	//requires(Robot.gyroSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
//    	if (Robot.oi.XboxController.getRawButton(7)){
//    		gyro = RobotMap.locationGyro.getAngle();
//    	}
//    	if (Robot.oi.XboxController.getRawButton(8)){
//    		gyro = 0;
//    	}
 
//Xbox Controller
    				///////////////////THIS CODE WORKS//////DO NOT CHANGE////////
    	if (Math.abs(-Robot.oi.gamepad1.getRawAxis(0)) > 0.1 || Math.abs(-Robot.oi.gamepad1.getRawAxis(1)) > 0.1 || Math.abs(-Robot.oi.gamepad1.getRawAxis(4)) > .2){
    		Robot.driveWithJoystick.arcadeDrive(null);
    	}

    				//////////////////THIS CODE WORKS^^^^^^^^DO NOT CHANGE////////
    	else{
    		RobotMap.driveTrainRobotDrive41.arcadeDrive(0,0);
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