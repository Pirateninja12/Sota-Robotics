package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class Winch extends Command {

    public Winch() {
        // Use requires() here to declare subsystem dependencies

    	
    	requires(Robot.manipulator);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	RobotMap.winchMotor.set(Robot.oi.gamepad1.getRawAxis(5)*.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
        RobotMap.winchMotor.set(0);
        
        return false;
        
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.winchlockSol.set(Value.kForward);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
