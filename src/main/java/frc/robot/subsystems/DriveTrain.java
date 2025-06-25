// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new Neo1. */
  public DriveTrain() {}
  SparkMax sparkMax = new SparkMax(1, MotorType.kBrushless);
  SparkMax sparkMax2 = new SparkMax(3, MotorType.kBrushless);

public void spin(double speed){
  speed = speed * -1;
  sparkMax.set(speed);
  sparkMax2.set(speed);
}
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
