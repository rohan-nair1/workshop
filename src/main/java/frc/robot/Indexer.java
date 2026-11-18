package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase {
    private SparkMax indexer = new SparkMax(1, MotorType.kBrushless);

    public Command Forward() {
        return run(()->{
            indexer.setVoltage(6);
        });
    }
    public Command Stop() {
        return run(()->{
            indexer.setVoltage(0);
        });
    }
    public Command Backwards() {
        return run(()->{
            indexer.setVoltage(-6);
        });
    }
}
