package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.text.SimpleDateFormat;
import java.util.Date;

@TeleOp(name="TeleOp", group="Iterative Opmode")  // @Autonomous(...) is the other common choice
public class NewRobotTeleOp extends OpMode {
    /* Declare OpMode members. */
    private ElapsedTime runtime = new ElapsedTime();

    private DcMotor backLeft = null;
    private DcMotor backRight = null;

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");

        /* eg: Initialize the hardware variables. Note that the strings used here as parameters
         * to 'get' must correspond to the names assigned during the robot configuration
         * step (using the FTC Robot Controller app on the phone).
         */
        backLeft  = hardwareMap.dcMotor.get("l2");
        backRight = hardwareMap.dcMotor.get("r2");
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
        if (backLeft.getDirection() == DcMotor.Direction.REVERSE) {
            backLeft.setDirection(DcMotor.Direction.FORWARD);
        }
        if (backRight.getDirection() == DcMotor.Direction.FORWARD) {
            backRight.setDirection(DcMotor.Direction.REVERSE);
        }
        telemetry.addData("Left Encoder", "Value is "+backLeft.getCurrentPosition());
        telemetry.addData("Right Encoder", "Value is "+backRight.getCurrentPosition());
        telemetry.update();
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
        runtime.reset();
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        telemetry.addData("Status", "Running: " + runtime.toString());

        backLeft.setPower(gamepad1.left_stick_y);
        backRight.setPower(-gamepad1.right_stick_y);

        telemetry.addData("Left Joy", gamepad1.left_stick_y);
        telemetry.addData("Right Joy", gamepad1.right_stick_y);
        telemetry.addData("Left Encoder", "Value is "+backLeft.getCurrentPosition());
        telemetry.addData("Right Encoder", "Value is "+backRight.getCurrentPosition());
        telemetry.update();
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {

    }
}