package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class Ofseason extends LinearOpMode {

    DcMotor LF;
    DcMotor LB;
    DcMotor RF;

    DcMotor RB;

    @Override
    public void runOpMode(){

        LF = hardwareMap.get(DcMotor.class, "LeftFront");
        LB = hardwareMap.get(DcMotor.class, "LeftBack");
        RF = hardwareMap.get(DcMotor.class, "RightFront");
        RB = hardwareMap.get(DcMotor.class, "RightBack");




        RF.setDirection(DcMotorSimple.Direction.REVERSE);
        RB.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        resetRuntime();


        while (opModeIsActive()){
            double max;
            double rot = gamepad1.left_stick_x;
            double hor =-gamepad1.right_stick_x;
            double ver = gamepad1.right_stick_y;


           double V_RF =(-rot + (  (-rot + (ver + hor) );
           double V_LF = (rot + (ver + hor) );
           double V_LB = (rot + (ver - hor) );


            max = Math.max(Math.abs(V_LF), Math.abs(V_RF));
            max = Math.max(max, Math.abs(V_LB));
            max = Math.max(max, Math.abs(V_RB));

            if (max > 1.0) {
                V_LF /= max;
                V_RF /= max;
                V_LB /= max;
                V_RB /= max;
            }
            RF.setPower(V_RF);
            LF.setPower(V_LF);
            RB.setPower(V_RB);
            LB.setPower(V_LB);

        }

    }
}