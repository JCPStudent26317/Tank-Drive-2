// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivebaseSubsys extends SubsystemBase {

  private TalonFX motorL1, motorL2, motorR1, motorR2;
  
  public DrivebaseSubsys(int motorL1Id, int motorL2Id, int motorR1Id, int motorR2Id, 
  boolean motorL1Invert, boolean motorL2Invert, boolean motorR1Invert, boolean motorR2Invert) {
    motorL1 = new TalonFX(motorL1Id);
    motorL2 = new TalonFX(motorL2Id);  
    motorR1 = new TalonFX(motorR1Id);
    motorR2 = new TalonFX(motorR2Id);

    motorL1.setInverted(motorL1Invert);
    motorL2.setInverted(motorL2Invert);
    motorR1.setInverted(motorR1Invert);
    motorR2.setInverted(motorR2Invert);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  /*public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
           one-time action goes here 
        });
  }*/

  public void setSpeeds(double speedL, double speedR){
    motorL1.set(speedL);
    motorL2.set(speedL);
    motorR1.set(speedR);
    motorR2.set(speedR);            
  }

  public void setSpeedsIndividual(double speedL1, double speedL2, double speedR1, double speedR2) {
    motorL1.set(speedL1);
    motorL2.set(speedL2);
    motorR1.set(speedR1);
    motorR2.set(speedR2);
  }

  @Override
  public void periodic() {
    
  }

  @Override
  public void simulationPeriodic() {
    
  }
}
