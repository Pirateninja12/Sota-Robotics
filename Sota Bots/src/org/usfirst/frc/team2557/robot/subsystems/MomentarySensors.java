package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MomentarySensors extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DigitalInput tote = RobotMap.toteStop;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
    
    public boolean checkTote(){
    	return tote.get();
    }
}

