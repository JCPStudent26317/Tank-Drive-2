// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants.OperatorConstants;
import frc.robot.subsystems.DrivebaseSubsys;
import frc.robot.subsystems.ExampleSubsystem;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;

public class ArcadeDriveCmd extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DrivebaseSubsys drivebase;
  private final Supplier<Double> joystickSpeed, joystickTurn;

  public ArcadeDriveCmd(DrivebaseSubsys drivebase, Supplier<Double> joystickSpeed, Supplier<Double> joystickTurn) {
    this.drivebase = drivebase;
    this.joystickSpeed = joystickSpeed;
    this.joystickTurn = joystickTurn;
    addRequirements();
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    double speed = deadzone(joystickSpeed.get(), OperatorConstants.deadzone);
    double turn = deadzone(joystickTurn.get(), OperatorConstants.deadzone);

    double left = speed + turn;
    double right = speed - turn;

    drivebase.setSpeeds(left, right);
  }

  @Override
  public void end(boolean interrupted) {
    drivebase.setSpeeds(0, 0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  public double deadzone(double input, double limit) {
    return Math.abs(input) >= limit ? input : 0.0;
  }

}
