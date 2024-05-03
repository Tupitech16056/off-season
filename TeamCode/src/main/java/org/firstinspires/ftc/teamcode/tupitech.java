package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class tupitech extends LinearOpMode {

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


        //DcMotor grau;
        //grau = hardwareMap.get(DcMotor.class,"...");
        //DcMotor cas;
        //cas = hardwareMap.get(DcMotor.class,"....");
       // DcMotor colet;
        //colet = hardwareMap.get(DcMotor.class,"..");

        RF.setDirection(DcMotorSimple.Direction.REVERSE);
        RB.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        resetRuntime();


        while (opModeIsActive()){

        double rot = gamepad1.left_stick_x;
        double hor =-gamepad1.right_stick_x;
        double ver = gamepad1.right_stick_y;

        //double grauup = gamepad2.left_stick_y;
        //double graudonw = -gamepad2.left_stick_y;
        
        //double casup = gamepad2.right_trigger;
        //double casdonw = gamepad2.left_trigger;
        
        //double coletup = gamepad2.right_stick_y;
        //double coletdonw = -gamepad2.right_stick_y;

        
        RF.setPower(-rot + (ver - hor) );
        RB.setPower(-rot + (ver + hor) );
        LF.setPower(rot + (ver + hor) );
        LB.setPower(rot + (ver - hor) );
        
        //colet.setPower(coletup);
        //colet.setPower(-coletdonw);
                   
        //grau.setPower(grauup);
        //grau.setPower(-graudonw);
        
        //cas.setPower(casup);
        //cas.setPower(-casdonw);
        
        
        }

    }
}