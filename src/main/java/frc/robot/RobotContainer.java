// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.DrivebaseConstants;
import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.DrivebaseSubsys;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {

  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  private final DrivebaseSubsys drivebase =
    new DrivebaseSubsys(DrivebaseConstants.drivebaseMotorL1Id, DrivebaseConstants.drivebaseMotorL2Id, DrivebaseConstants.drivebaseMotorR1Id, DrivebaseConstants.drivebaseMotorR2Id,
      DrivebaseConstants.drivebaseMotorL1Invert, DrivebaseConstants.drivebaseMotorL2Invert, DrivebaseConstants.drivebaseMotorR1Invert, DrivebaseConstants.drivebaseMotorR2Invert);

  public RobotContainer() {
    drivebase.setDefaultCommand(new ArcadeDriveCmd(drivebase, () -> -1 * m_driverController.getLeftY(), () -> m_driverController.getRightX()));

    configureBindings();
  }


  private void configureBindings() {

    

  }

  public Command getAutonomousCommand() {
    return null;
  }
}
