package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team2557.robot.commands.*;



//This is the next part of the programming Journal
//Created 1/5/16
//made to learn how to program robots
//goal was to learn how to program in robot java
//modified on 1/7/16 
//for the 2014 robot. This code is supposed to be done by the end of the day today which is 1/7/16. 
//Finished the notes on this code after lunch on 1/8/15. 
//Found problems uploading to the RoborIO

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {


   public Joystick gamepad1;
   
   //This is specifying the game pad.
  
   public JoystickButton gp1A;
   public JoystickButton gp1B;
   public JoystickButton gp1X;
   public JoystickButton gp1Y;
   public JoystickButton gp1LB;
   public JoystickButton gp1RB;
   public JoystickButton gp1BACK;
   public JoystickButton gp1START;
   public JoystickButton gp1LJB;
   public JoystickButton gp1RJB;
   
   Joystick drivetrain;

   
   //Defining each of Joy stick Buttons

   public OI() {
       gamepad1 = new Joystick(0);
       
       
       gp1A = new JoystickButton(gamepad1, 1);       
       gp1B = new JoystickButton(gamepad1, 2);
       gp1X = new JoystickButton(gamepad1, 3);
       gp1Y = new JoystickButton(gamepad1, 4);
       gp1LB = new JoystickButton(gamepad1, 5);
       gp1RB = new JoystickButton(gamepad1, 6);
       gp1BACK = new JoystickButton(gamepad1, 7);
       gp1START = new JoystickButton(gamepad1, 8);
       gp1LJB = new JoystickButton(gamepad1, 9);
       gp1RJB = new JoystickButton(gamepad1, 10);
       drivetrain = new Joystick(1);
      
       //This is assigning each of the buttons that were defined above to where they are located on the game pad.
       //drive train in this instance is allowing the drive train to be controlled by one joy stick or arcade drive.
       //(system) = new Joystic(value);
       //This is so the drive train moves wi
       
       gp1A.whenPressed(new Winch());
       gp1B.whenPressed(new Supershifter());
       gp1X.whenPressed(new Intakearm());
       
       //These buttons do things when they are pressed.
       
   }
   
   public Joystick getGamepad1() {
   	return gamepad1;
   }
   
   } 
  


