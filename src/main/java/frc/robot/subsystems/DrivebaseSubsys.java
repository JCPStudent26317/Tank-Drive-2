// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivebaseSubsys extends SubsystemBase {

  private CANSparkMax motorL1, motorL2, motorR1, motorR2;
  
  public DrivebaseSubsys(int motorL1Id, int motorL2Id, int motorR1Id, int motorR2Id, 
  boolean motorL1Invert, boolean motorL2Invert, boolean motorR1Invert, boolean motorR2Invert) {
    motorL1 = new CANSparkMax(motorL1Id, CANSparkLowLevel.MotorType.kBrushless);
    motorL2 = new CANSparkMax(motorL2Id, CANSparkLowLevel.MotorType.kBrushless);  
    motorR1 = new CANSparkMax(motorR1Id, CANSparkLowLevel.MotorType.kBrushless);
    motorR2 = new CANSparkMax(motorR2Id, CANSparkLowLevel.MotorType.kBrushless);

    motorL1.setInverted(motorL1Invert);
    motorR1.setInverted(motorR1Invert);

    motorL2.follow(motorL1, motorL2Invert);
    motorR2.follow(motorR1, motorR2Invert);
  }

  public void setSpeeds(double speedL, double speedR){
    motorL1.set(deadzone(speedL, 0.1));
    motorR1.set(deadzone(speedR, 0.1));
  }

  /*
  public void setSpeedsIndividual(double speedL1, double speedL2, double speedR1, double speedR2) {
    motorL1.set(speedL1);
    motorL2.set(speedL2);
    motorR1.set(speedR1);
    motorR2.set(speedR2);
  }
 */
  @Override
  public void periodic() {
    
  }

  @Override
  public void simulationPeriodic() {
    
  }

  public double deadzone(double input, double zone) {
    return Math.abs(input - zone) <= input ? 0 : input; 
  }

}
