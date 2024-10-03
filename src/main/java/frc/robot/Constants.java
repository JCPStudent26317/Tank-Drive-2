// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class DrivebaseConstants {
    public static final int drivebaseMotorL1Id = 1;
    public static final int drivebaseMotorL2Id = 2;
    public static final int drivebaseMotorR1Id = 3;
    public static final int drivebaseMotorR2Id = 4;
    
    public static final boolean drivebaseMotorL1Invert = false;
    public static final boolean drivebaseMotorL2Invert = false;
    public static final boolean drivebaseMotorR1Invert = false;
    public static final boolean drivebaseMotorR2Invert = false;
  }

}
