package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2557.robot.OI;
import org.usfirst.frc.team2557.robot.subsystems.*;

//notice that this code does not have an autonomous mode.
//Also notice that their are very few commands and code on this page due to the use of commands and subsystems.
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
    Command drive;
    Command dashboard;
    Command Winch;
    Command WinchLock;
    Command Intakearm;
    
    //These 
    
    public static OI oi;
    public static DriveTrain driveWithJoystick;
    public static Manipulator manipulator;
    public static HallEffect hallEffect;
    public static Encoders encoders;
    
    public static DigitalOutput LimitSwitch;
    public static SmartDashboardSS dashboardSub;
   
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        driveWithJoystick = new DriveTrain();
        
      oi = new OI();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        drive.start();
        dashboard.start();
        WinchLock.start();
        Winch.start();
        Intakearm.start();
        
        //These are all the commands that will be initiated when the robot turns on.
        
        SmartDashboard.putBoolean("The Intakearm sensor is reading",RobotMap.intakearmStop.get());
        
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
        //init.start();
    }

	
}
