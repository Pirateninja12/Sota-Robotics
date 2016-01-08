package org.usfirst.frc.team2557.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

//This is my programming Journal.
//Started this code on 1/5/16.
//Made to learn what each system is.
//Modified 1/7/16.
//Made for 2014 robot.
//Simplifying code on 1/8/16
//Goal Add comments to make code easier to read along with making it more organized.
//Finished adding all notes to the robot map.
//Starting the OI notes hopefully will be completed before lunch.

public class RobotMap {
                                                        //These are each of the ports that the motors will be connected to.
	public static SpeedController driveTrainFrontLeft;  //Port0
	public static SpeedController driveTrainFrontRight; //Port1
	public static SpeedController driveTrainBackLeft;   //Port2
	public static SpeedController driveTrainBackRight;  //Port3
	public static SpeedController intakearmMotor;       //Port4
	public static SpeedController winchMotor;           //Port5
	public static RobotDrive driveTrainRobotDrive41;
	
	//Speed controller is for each of the motors only. 
	//This is labeling each of the motors that will be on the robot.
	//This is where each of the motors are located on the drive train
	                                                    //This is where each of the ports are located
	public static DoubleSolenoid intakearmSol;          //(0,2,3)
	public static DoubleSolenoid winchlockSol;          //(0,0,1)
	public static DoubleSolenoid supershifterSol;       //(o,4,5)
	
	//This is labeling each of the Double Solenoid's that are on the robot.
	//This is where each of the Solenoid's are located
	                                                    //This is where each of the Inputs are gong to be located.
	public static AnalogInput rangeLeft;                //Port0
	public static AnalogInput rangeRight;               //Port1
	public static AnalogInput rangeCenter;              //Port2
	
	//Analog is for the joystick's
	//Singular joy stick because this code is using a arcade drive.
	//Also only using one game pad for testing.
	                                                    //This is where each of the encoders, sensors, and safeties will be located. 
	public static Counter LeftEnc;                      //Port0
	public static Counter RightEnc;                     //Port1
	public static Counter WinchEnc;                     //Port2
	public static DigitalInput toteStop;                //Port3
	public static DigitalInput intakearmSensor;         //Port4
	public static DigitalInput intakearmStop;           //Port5
	
	//Three encoders for 5 motors
	//Left Encoder is for the left side motors that are used for the drive train.
	//Right Encoder is for the right side motors that are used for the drive train.
	//Winch Encoder is for the winch motor.
	//Each of the drive train encoders are not located on the motors but on a axis.
	//Enc. stands for encoder.
	
	public static boolean intakearmState;
	public static boolean winchlockState;
	public static boolean supershifterState;
	public static int degCount;
	public static double centerDegreeR;
	public static double changeDegreeR;
	public static double centerDegreeL;
	public static double changeDegreeL;
	public static int intakearmLevel;
	public static int maxintakearmLevel;
	public static int minintakearmLevel;
	public static int lowintakearmLevel;
	public static double intakearmSpeed;
	public static int winchLevel;
	public static int maxwinchLevel;
	public static int minwinchLevel;
	public static int lowwinchLevel;
	public static double winchSpeed;
	public static boolean intakearmbool;
	public static boolean winchlockbool;
	public static boolean supershifterbool;
	
	//variables
	//These are the manipulated variables 
	
	public static double[] leftArray;
	public static double[] centerArray;
	public static double[] rightArray;
	
	//Arrays
	
	static 
	
	//The static is for the drive train to make the code viable
	
	RobotDrive drivetrain;
	public static PowerDistributionPanel PDP;
	
	
	//Other things that need to be included to make the robot function
	
	public static void init() {
		intakearmMotor = new Talon(2);
		
		winchMotor = new Talon(3);
		
		driveTrainFrontLeft = new Talon(0);
		LiveWindow.addActuator("DriveTrain", "FrontLeft", (Talon) driveTrainFrontLeft);
		
		driveTrainFrontRight = new Talon(1);
		LiveWindow.addActuator("DriveTrain", "FrontRight", (Talon) driveTrainFrontRight);
		
		driveTrainBackLeft = new Talon(5);
		LiveWindow.addActuator("DriveTrain", "BackLeft", (Talon) driveTrainBackLeft);
		
		driveTrainBackRight = new Talon(4);
		LiveWindow.addActuator("DriveTrain", "BaclLaft", (Talon) driveTrainBackRight);
		
		driveTrainRobotDrive41 = new RobotDrive(driveTrainFrontLeft, driveTrainFrontRight, driveTrainBackLeft, driveTrainBackRight);
		driveTrainRobotDrive41.setSafetyEnabled(false);
		SmartDashboard.putBoolean("Safety= ", driveTrainRobotDrive41.isSafetyEnabled());
		
		drivetrain = new RobotDrive(1, 2, 3, 4);
		
		//The CAN Talons are the motors that will be on the robot.
		
		intakearmSol = new DoubleSolenoid(0, 2, 3);
		winchlockSol = new DoubleSolenoid(0, 0, 1);
		supershifterSol = new DoubleSolenoid(0, 4, 5);
		
		//This is making the solenoid's locations known
		//Solenoid's
		
		intakearmState = false;
		winchlockState = false;
		supershifterState = false;
		
		//This is setting the default state for each of the solenoids
		
		degCount = 0;
		intakearmLevel = 0;
		maxintakearmLevel = 12;
		minintakearmLevel = 0;
		intakearmSpeed = 1;
		
		//The level is the extension of the solenoid's
		//This goes for each of the solenoid's
		//In take arm Speed
		
		winchLevel = 0;
		maxwinchLevel = 6;
		minwinchLevel = 0;
		lowwinchLevel = 1;
		winchSpeed = 1;
		
		//Winch speed
		
		rangeLeft = new AnalogInput(1);
		rangeCenter = new AnalogInput(3);
		rangeRight = new AnalogInput(2);
		
		//Range Finders for Robot

		driveTrainRobotDrive41.setSafetyEnabled(true);
		driveTrainRobotDrive41.setExpiration(0.1);
		driveTrainRobotDrive41.setSensitivity(0.5);
		driveTrainRobotDrive41.setMaxOutput(1.0);
		driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		
		//Drive Train Sensitivity, Max and Min Input
		
		toteStop = new DigitalInput(3);
		intakearmSensor = new DigitalInput(4);
		intakearmStop = new DigitalInput(5);
		
		//Digital IO
		
		LeftEnc = new Counter(0);
	    LeftEnc.setMaxPeriod(.1);
	    LeftEnc.setUpdateWhenEmpty(true);
	    LeftEnc.setReverseDirection(false);
	    LeftEnc.setSamplesToAverage(10);
	    LeftEnc.setDistancePerPulse(12);
	    
	    //Left Side Encoder values
	    
	    RightEnc = new Counter(1);
	    RightEnc.setMaxPeriod(.1);
	    RightEnc.setUpdateWhenEmpty(true);
	    RightEnc.setReverseDirection(false);
	    RightEnc.setSamplesToAverage(10);
	    RightEnc.setDistancePerPulse(12);
	    
	    //Right Side Encoder values
	   
	    WinchEnc = new Counter(2);
	    WinchEnc.setMaxPeriod(.1);
	    WinchEnc.setUpdateWhenEmpty(true);
	    WinchEnc.setReverseDirection(false);
	    WinchEnc.setSamplesToAverage(10);
	    WinchEnc.setDistancePerPulse(12);
	    
	    //Winch Encoder values
		
	    intakearmSol.set(Value.kReverse);
	    intakearmbool = true;
	    winchlockSol.set(Value.kReverse);
	    winchlockbool = true;
	    supershifterSol.set(Value.kReverse);
	    supershifterbool = true;
	    
	    //Initializing the Solenoid's
	    
	    
	    
		
	}
}
