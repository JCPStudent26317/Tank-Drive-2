// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;

    public static final double deadzone = 0.1;
  }

  public static class DrivebaseConstants {
    public static final int drivebaseMotorL1Id = 11;
    public static final int drivebaseMotorL2Id = 12;
    public static final int drivebaseMotorR1Id = 21;
    public static final int drivebaseMotorR2Id = 22;
    
    //Should be set up so that a positive input to all the motors leads to the robot moving straight forward.
    public static final boolean drivebaseMotorL1Invert = false;
    public static final boolean drivebaseMotorL2Invert = false;
    public static final boolean drivebaseMotorR1Invert = true;
    public static final boolean drivebaseMotorR2Invert = false;

    public static final double drivebaseDriveMult = 0.7;
    public static final double drivebaseTurnMult = 0.3;
  }

}
