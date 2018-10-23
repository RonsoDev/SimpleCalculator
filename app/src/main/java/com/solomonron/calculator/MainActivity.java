package com.solomonron.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tv;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnZero;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnDiv;
    private Button btnMultiply;
    private Button btnEquals;
    private Button btnClear;
    private Button btnDelete;
    private Button btnDot;
    private Button btnPercentage;
    private Button btnRoot;
    private Button btnPower;
    private double firstnumber;
    private double percentNum;
    private double secondNum;
    private TextView parameter;
    private boolean flagfirstNumIsPercentNum;// בודק אם האופרנד של האחוז הוא המספר הראשון
    private boolean flag;  //כדי לדעת אם לשרשר מספרים או להחליף את המספר במספר אחר, כלומר אם היה שימוש בפרמטר או לא. FALSE = לא היה שימוש באופרטור
    private boolean flagDot;//אם TRUE, ניתן לשרשר נקודה
    private boolean flagStartDot;//במידה ונלחץ נקודה לפני שנלחץ מספר כלשהו, ישרשר ".0"
    private boolean flagpercentage; // לוודא שימוש באופרטור האחוז. אם FALSE לוקח את percentNum כאחד האופרנדים
    private boolean flagpercentageFirstNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView parameter = findViewById(R.id.textViewParameter);

        final TextView tv = findViewById(R.id.textViewResult);

        flag = true;
        flagDot = true;
        flagStartDot = true;
        flagpercentage = true;
       // flagpercentageFirstNum = true;
        flagfirstNumIsPercentNum = true;


        Button btnOne = findViewById(R.id.buttonOne);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("1");
                }else{
                    tv.append("1");

                }
                flagStartDot = false;

            }
        });
        Button btnTwo = findViewById(R.id.buttonTwo);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("2");
                }else{
                    tv.append("2");

                }
                flagStartDot = false;

            }
        });
        Button  btnThree = findViewById(R.id.buttonThree);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("3");
                }else{
                    tv.append("3");

                }
                flagStartDot = false;

            }
        });
        Button btnFour = findViewById(R.id.buttonFour);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("4");
                }else{
                    tv.append("4");

                }
                flagStartDot = false;

            }
        });
        Button btnFive = findViewById(R.id.buttonFive);
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("5");
                }else{
                    tv.append("5");

                }
                flagStartDot = false;

            }
        });
        Button btnSix = findViewById(R.id.buttonSix);
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("6");
                }else{
                    tv.append("6");

                }
                flagStartDot = false;

            }
        });
        Button btnSeven = findViewById(R.id.buttonSeven);
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("7");
                }else{
                    tv.append("7");

                }
                flagStartDot = false;

            }
        });
        Button btnEight = findViewById(R.id.buttonEight);
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag){
                    flag = false;
                    tv.setText("8");
                }else{
                    tv.append("8");

                }
                flagStartDot = false;



            }
        });
        Button btnNine = findViewById(R.id.buttonNine);
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("9");
                }else{
                    tv.append("9");

                }
                flagStartDot = false;

            }
        });
        Button btnZero = findViewById(R.id.buttonZero);
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    flag = false;
                    tv.setText("0");
                }else{
                    tv.append("0");

                }
                flagStartDot = false;

            }
        });
        Button btnDelete = findViewById(R.id.buttonDel);
       /* btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        Button btnClear = findViewById(R.id.buttonClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
                parameter.setText("");
                flag = true;
                flagDot = true;
                flagStartDot = true;
            }
        });




        Button btnPlus = findViewById(R.id.buttonPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                parameter.setText("+");

                if( flagpercentage == false){
                    flag = true;
                    flagDot = true;
                    flagStartDot = true;
                   // flagpercentage = true;
                }else{
                    firstnumber = Double.valueOf(tv.getText().toString());
                    flag = true;
                    flagDot = true;
                    flagStartDot = true;

                }




            }
        });
        Button btnMinus = findViewById(R.id.buttonMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parameter.setText("-");
                firstnumber = Double.valueOf(tv.getText().toString());
                flag = true;
                flagDot = true;
                flagStartDot = true;



            }
        });
        Button btnDiv = findViewById(R.id.buttonDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parameter.setText("/");
                firstnumber = Double.valueOf(tv.getText().toString());
                flag = true;
                flagDot = true;
                flagStartDot = true;



            }
        });
        Button btnMultiply = findViewById(R.id.buttonMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parameter.setText("*");
                firstnumber = Double.valueOf(tv.getText().toString());
                flag = true;
                flagDot = true;
                flagStartDot = true;



            }
        });


        Button btnPercentage = findViewById(R.id.buttonPercentage);
        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (parameter.getText().toString() == "+" || parameter.getText().toString() == "-" || parameter.getText().toString() == "*" || parameter.getText().toString() == "/"  ){
                   // flagfirstNumIsPercentNum = true;

                    secondNum = Double.valueOf(tv.getText().toString());
                    secondNum = secondNum * (firstnumber/100);
                    flagfirstNumIsPercentNum = false;

                    /*firstnumber = Double.valueOf(tv.getText().toString());
                    firstnumber = firstnumber/100;*/


                }else{
                /*    secondNum = Double.valueOf(tv.getText().toString());
                    secondNum = secondNum * (firstnumber/100);
                    flagfirstNumIsPercentNum = false;*/

                    firstnumber = Double.valueOf(tv.getText().toString());
                    firstnumber = firstnumber/100;

                }
                tv.append("%");


/*
                percentNum = Double.valueOf(tv.getText().toString());

                tv.append("%");

                if (percentNum != 0 && (flagfirstNumIsPercentNum = false)){

                    percentNum = firstnumber / 100 * percentNum;

                }*/

                flagpercentage = false;
                flag = true;
                flagDot = true;
                flagStartDot = true;
            }
        });




        Button btnEquals = findViewById(R.id.buttonEquals);
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flagpercentage == false) {

                    if (flagfirstNumIsPercentNum){
                        flagfirstNumIsPercentNum = false;

                        secondNum = Double.valueOf(tv.getText().toString());


                       /* firstnumber = Double.valueOf(tv.getText().toString());
                        percentNum = firstnumber / 100 * percentNum;
                        secondNum = percentNum;*/

                    }


                }else{
                    //secondNum = percentNum;
                    secondNum = Double.valueOf(tv.getText().toString());

                }


                double result;
                int intResult;

                switch (parameter.getText().toString()){

                    case "+":

                        result = firstnumber + secondNum;
                        if ((result == (int) result)){
                            intResult = (int) result;
                            tv.setText(intResult+"");
                            flagDot = true;
                        }else{
                            tv.setText(result+"");
                            flagDot = false;


                        }flag = true;
                        flagpercentage = true;


                        break;

                    case "-":
                        result = firstnumber - secondNum;
                        if ((result == (int) result)){
                            intResult = (int) result;
                            tv.setText(intResult+"");
                            flagDot = true;

                        }else{
                            tv.setText(result+"");
                            flagDot = false;


                        }flag = true;
                        flagpercentage = true;

                        break;

                    case "/":
                        result = firstnumber / secondNum;
                        if ((result == (int) result)){
                            intResult = (int) result;
                            tv.setText(intResult+"");
                            flagDot = true;

                        }else{
                            tv.setText(result+"");
                            flagDot = false;


                        }flag = true;
                        flagpercentage = true;


                        break;

                    case "*":
                        result = firstnumber * secondNum;
                        if ((result == (int) result)){
                            intResult = (int) result;
                            tv.setText(intResult+"");
                            flagDot = true;

                        }else{
                            tv.setText(result+"");
                            flagDot = false;


                        }flag = true;
                        flagpercentage = true;


                        break;






                }
                parameter.setText("");


            }

        });
        Button btnDot = findViewById(R.id.buttonDot);
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flagDot){
                    flagDot = false;
                    tv.append(".");

                }
                if (flagStartDot){
                    tv.setText("0.");
                    flag = false;
                    flagStartDot = false;
                }


            }
        });



    }




}
