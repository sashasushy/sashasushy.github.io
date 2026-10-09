package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Chapter5OpMode extends OpMode {

    RobotLocation robotLocation = new RobotLocation(0);
    @Override
    public void init() {
        telemetry.addData("unghiul robotului?", robotLocation.getAngle());
    }

    @Override
    public void loop() {
        if(gamepad1.dpad_left)
            robotLocation.changeX(-0.1);
        else if(gamepad1.dpad_right)
            robotLocation.changeX(0.1);
        if(gamepad1.dpad_up)
            robotLocation.changeY(0.1);
        else if(gamepad1.dpad_down)
            robotLocation.changeY(-0.1);
    }

}
