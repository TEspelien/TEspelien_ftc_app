package org.eastsideprep.ftc;

import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


/**
 * Hardware definitions for 15203
 */
public class HardwareMap_TEspelien {
    /* Public OpMode members. */

    public DcMotor leftBackMotor = null;
    public DcMotor rightBackMotor = null;

    /* local OpMode members. */
    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    /* Constructor */
    public HardwareEAllgor() {
    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        //the names of the motors are set on the RC phone in the TEspelien configuration
        leftBackMotor = hwMap.dcMotor.get("leftBackMotor");
        rightBackMotor = hwMap.dcMotor.get("rightBackMotor");

        allMotors = new DcMotor[]{leftFrontMotor, rightFrontMotor, leftBackMotor, rightBackMotor};


        leftBackMotor.setDirection(DcMotor.Direction.FORWARD);
        rightBackMotor.setDirection(DcMotor.Direction.REVERSE);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
//
//        leftBackMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        rightBackMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
    }
}

