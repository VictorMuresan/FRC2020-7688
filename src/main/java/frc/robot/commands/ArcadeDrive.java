/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.Joystick;



public class ArcadeDrive extends CommandBase 
{
  /**
   * Creates a new ArcadeDrive.
   */


  private final Drivetrain __Drivetrain;
  private final Joystick __Joystick;

  public ArcadeDrive() 
  {
    // Use addRequirements() here to declare subsystem dependencies.

    __Drivetrain = RobotContainer.m_DriveTrain;
    __Joystick = RobotContainer.m_joystick;

    addRequirements(__Drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() 
  {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    __Drivetrain.DT_ArcadeDrive(__Joystick.getRawAxis(Constants.CB_DRIVE_DRIVEFORWARD_AXIS),
                                __Joystick.getRawAxis(Constants.CB_DRIVE_TURN_AXIS));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() 
  {
    return false;
  }
}
