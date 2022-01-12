package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class DriveTrain extends SubsystemBase
{
    //initialize speed controllers and their groups.
    private MotorController sp_left1;
    private MotorController sp_left2;
    private MotorController sp_right1;
    private MotorController sp_right2;
    private MotorControllerGroup spg_left;
    private MotorControllerGroup spg_right;
    private DifferentialDrive dd_drive;
    public DriveTrain(){
        sp_left1 = new Spark(Constants.DriveTrain.DRIVE_PWM_LEFT1);
        sp_left2 = new Spark(Constants.DriveTrain.DRIVE_PWM_LEFT2);
        sp_right1 = new Spark(Constants.DriveTrain.DRIVE_PWM_RIGHT1);
        sp_right2 = new Spark(Constants.DriveTrain.DRIVE_PWM_RIGHT2);
        spg_left = new MotorControllerGroup(sp_left1, sp_left2);
        spg_right = new MotorControllerGroup(sp_right1, sp_right2);
        dd_drive = new DifferentialDrive(spg_left, spg_right);
    }    
    public void arcadeDrive(double x, double y, double z){
       dd_drive.arcadeDrive(-y, (x+(z*.25))); 
    }
    
}
