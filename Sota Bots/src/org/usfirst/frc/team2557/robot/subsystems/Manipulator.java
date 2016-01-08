package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Manipulator extends Subsystem {
    
	
	SpeedController intakearm 		= RobotMap.intakearmMotor;
	double intakearmSpd = RobotMap.intakearmSpeed;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void liftUp(){
    	intakearm.set(intakearmSpd);
    }
    public void liftDown(){
    	intakearm.set(-intakearmSpd);
    }
    public void liftStop(){
    	intakearm.set(0);
    }
    public void lift(){
    	intakearm.set(-Robot.oi.gamepad1.getRawAxis(5));
    }
 

    
}

