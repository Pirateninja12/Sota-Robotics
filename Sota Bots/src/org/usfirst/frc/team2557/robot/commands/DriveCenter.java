package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCenter extends Command {
	// Let's go ahead and call crap that we're going to be calling soone anyways.
	
	
	private double speed;
	
	private double angl;
	
	
    public 	DriveCenter(String side, double target, double location, double speed) { // <-- call them again... 0\
    	// And one more time for luck... So damn dumb. Wherz mah paithawnz!?
       
        this.speed = speed;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveWithJoystick);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// Call radar to determine which side and which degree is center.
    	// Need to determine which side we need to line target up to on frame.
	
		
		
    	//// NOT DONE. CANT CONTINUE UNTIL MATH IS RIGHT
    	float rotation = 0;
    	// call offset to calculate what degree target is what degree on gyro.
    	Robot.driveWithJoystick.arcadeDrive_Polar123(speed, angl, rotation);
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