package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SmartDashboardSS extends Subsystem {
	Counter LeftEncoder 	= RobotMap.LeftEnc;
	Counter RightEncoder 	= RobotMap.RightEnc;
	Counter WinchEncoder 	= RobotMap.WinchEnc;
	AnalogInput rangeLeft 		= RobotMap.rangeLeft;
	AnalogInput rangeRight 		= RobotMap.rangeRight;
	AnalogInput rangeCenter		= RobotMap.rangeCenter;
	PowerDistributionPanel PDP	= RobotMap.PDP;
	
	double divider 		= .009765;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void limitSwitchOutput() {
        //Limit Switch
        if(RobotMap.toteStop.equals(true)){
            SmartDashboard.putString("Limit Switch", "ON");
        }
        else{
            SmartDashboard.putString("Limit Switch", "OFF");
        }
    }    
    public void locationOutput(){
 
        
        }
        
    public void rangeOutputs(){
    	//RangeFinders
        
        SmartDashboard.putNumber("The Left Range Finder normal: ", rangeLeft.getVoltage()/divider);
        SmartDashboard.putNumber("The Right Range Finder normal: ", rangeRight.getVoltage()/divider);
        SmartDashboard.putNumber("The Center Range Finder normal: ", rangeCenter.getVoltage()/divider);
        SmartDashboard.putNumber("The Left Range Finder average: ", rangeLeft.getAverageVoltage()/divider);
        SmartDashboard.putNumber("The Right Range Finder average: ", rangeRight.getAverageVoltage()/divider);
        SmartDashboard.putNumber("The Center Range Finder average: ", rangeCenter.getAverageVoltage()/divider);
    }
    
    public void encoderOutput(){
    	//Encoders
        SmartDashboard.putNumber("left enc", LeftEncoder.get());
    	SmartDashboard.putNumber("right enc", RightEncoder.get());
    	SmartDashboard.putNumber("winch enc", WinchEncoder.get());
    	
    }
    public void powerOutput(){
    	//Power Distribution
    	SmartDashboard.putNumber("Front Right", PDP.getCurrent(12));
        SmartDashboard.putNumber("Front Left", PDP.getCurrent(13));
        SmartDashboard.putNumber("Back Right", PDP.getCurrent(14));
        SmartDashboard.putNumber("Back Left", PDP.getCurrent(15));
    }
}

