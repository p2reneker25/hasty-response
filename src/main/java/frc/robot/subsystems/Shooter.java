
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;
import com.ctre.phoenix.CANifier;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import edu.wpi.first.wpilibj.motorcontrol.Talon;


public class Shooter extends SubsystemBase {
  private PWMTalonFX mc_flyWheel;
  private PWMTalonFX mc_flyWheel2;
  private Servo sv_servo;
  public Shooter() {
    sv_servo = new Servo(Constants.Shooter.SERVO_PWM);
    mc_flyWheel = new PWMTalonFX(Constants.Shooter.SHOOTER_PWM_0);
    mc_flyWheel2 = new PWMTalonFX(Constants.Shooter.SHOOTER_PWM_1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setServoPosition(double value) { //value is 0 to 1
    //servo.set(value);
  }
  public void shoot(double speed){
    mc_flyWheel.set(speed);
    mc_flyWheel2.set(-speed);
    System.out.println("shooting");
  }

  public void stopShoot(){
    mc_flyWheel.set(0);
    mc_flyWheel2.set(0);
  }
  public void getEncoderDifference(){
    
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
