package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
@Autonomous(name="Linear auto example")
@Disabled
public class ExampleAuto extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        // initialize out auto actions and put them in a var
        AutoActions autoActions = new AutoActions(hardwareMap);
        // waits until the start button gets pressed
        waitForStart();

        autoActions.shoot(5_000);
        // 24 is a PLACEHOLDER - please find the correct value for your robot
        autoActions.driveForward(1.0,24);
    }
}
