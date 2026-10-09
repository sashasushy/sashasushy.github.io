package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Chapter4 extends OpMode {
    public void init()
    {

    }
    public void loop()
    {
        //"turbo button"
        double forwardSpeed;
        if (!gamepad1.a)
            forwardSpeed=gamepad1.right_stick_y*(-0.5);
        else
            forwardSpeed=gamepad1.right_stick_y*(-1);
        telemetry.addData("Forward Speed:",forwardSpeed);

        //"crazy mode"
        if(gamepad1.a)
        {
            telemetry.addData("X:", gamepad1.right_stick_y * (-1));
            telemetry.addData("Y:",gamepad1.right_stick_x);
        }
        else
        {
            telemetry.addData("X:", gamepad1.right_stick_x);
            telemetry.addData("Y:",gamepad1.right_stick_y*(-1));
        }
    }
}
