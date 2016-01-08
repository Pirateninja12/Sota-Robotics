package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Encoders extends Subsystem {
    
    public static Counter Left = RobotMap.LeftEnc;
    public static Counter Right = RobotMap.RightEnc;
    public static Counter Winch =  RobotMap.WinchEnc;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public int frontLeft(){
    	return Left.get();
    }
    public int frontRight(){
    	return Right.get();
    }
    public int rearLeft(){
    	return Winch.get();
    }
   
  
    public void reset(){
    	Left.reset();
    	Right.reset();
    	Winch.reset();
    }
}

