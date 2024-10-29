package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.DrivebaseSubsys;

public class AutoDriveForwardCmd extends Command {
  private final DrivebaseSubsys drivebase;
  private final double startTime;

  public AutoDriveForwardCmd(DrivebaseSubsys drivebaseSubsys) {
    drivebase = drivebaseSubsys;
    addRequirements(drivebase);

    startTime = Timer.getFPGATimestamp();
  }

  @Override
  public void initialize() {
    System.out.println("Auto drive forward cmd start");
  }

  @Override
  public void execute() {
    if(getTimeSinceStart() <= 3.0){
      drivebase.setSpeeds(0.5, 0.5);
    }else {
      drivebase.setSpeeds(0, 0);
    }
    System.out.println(getTimeSinceStart());
  }

  @Override
  public void end(boolean interrupted) {
    drivebase.setSpeeds(0.0, 0.0);
    System.out.println("Auto drive forward cmd end");
  }

  public double getTimeSinceStart() {
    return Timer.getFPGATimestamp() - startTime;
  }

  @Override
  public boolean isFinished() {
    /*if(getTimeSinceStart() > 3.0) {
        return true;
    }
    else return false;*/
    return false;
  }
}
