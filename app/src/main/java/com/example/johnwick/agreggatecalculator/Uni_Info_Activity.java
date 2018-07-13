package com.example.johnwick.agreggatecalculator;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Uni_Info_Activity extends AppCompatActivity {
    TextView uniNameText, aggregateText ;
    TextInputLayout obtainedMarksCard1Input, obtainedMarksCard2Input, obtainedMarksCard3Input ;
    TextInputLayout totalMarksCard1Input, totalMarksCard2Input, totalMarksCard3Input ;
    TextInputLayout percentageCard1Input, percentageCard2Input, percentageCard3Input ;

    int entryTestWeightage = 0, fscWeightage = 0, matricWeightage = 0, allCardDone = 0 ;

    Button done ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni__info_);

        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'>Aggregate Calculator</font>"));



        assign() ;
        removeErrorsOnInputLayouts() ;

        aggregateText.setVisibility(View.GONE);




        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(obtainedMarksCard1Input.getEditText().getText().toString().equals("")) || !(totalMarksCard1Input.getEditText().getText().toString().equals(""))) {
                    setPercentagecard1();
                }
                if(!(obtainedMarksCard2Input.getEditText().getText().toString().equals("")) || !(totalMarksCard2Input.getEditText().getText().toString().equals(""))) {
                    setPercentagecard2();
                }
                if(!(obtainedMarksCard3Input.getEditText().getText().toString().equals("")) || !(totalMarksCard3Input.getEditText().getText().toString().equals(""))) {
                    setPercentagecard3();
                }



//                if((obtainedMarksCard1Input.getEditText().getText().toString().equals("")) && (totalMarksCard1Input.getEditText().getText().toString().equals("")) && (percentageCard1Input.getEditText().getText().equals("") )) {
//                    allCardDone++;
//                    Toast.makeText(Uni_Info_Activity.this, "increment done" , Toast.LENGTH_LONG).show();
//                }
//
//                if((obtainedMarksCard2Input.getEditText().getText().toString().equals("")) && (totalMarksCard2Input.getEditText().getText().toString().equals("")) && (percentageCard2Input.getEditText().getText().equals("") )) {
//                    allCardDone++;
//                }
//
//                if((obtainedMarksCard3Input.getEditText().getText().toString().equals("")) && (totalMarksCard3Input.getEditText().getText().toString().equals("")) && (percentageCard3Input.getEditText().getText().equals("") )) {
//                    allCardDone++;
//
//                }





                    setAggregateWithPercentage();
            }

        });


    }

    void setPercentagecard1(){

        if(!(obtainedMarksCard1Input.getEditText().getText().toString().equals("")) || !(totalMarksCard1Input.getEditText().getText().toString().equals(""))){
            if(obtainedMarksCard1Input.getEditText().getText().toString().equals("")){
                obtainedMarksCard1Input.setError("Enter Obtained Marks Plz");
                return ;
            }
            if(totalMarksCard1Input.getEditText().getText().toString().equals("")){
                totalMarksCard1Input.setError("Enter Total Marks Plz");
                return ;
            }
            allCardDone++ ;

            //Toast.makeText(Uni_Info_Activity.this, "In If" , Toast.LENGTH_LONG).show();
            DecimalFormat df2 = new DecimalFormat(".##");
            double per = 0.0, obt = 0.0 , total = 0.0;
            //obt = obtainedMarksCard1Input.getEditText().getText();
            per = ((Double.parseDouble(obtainedMarksCard1Input.getEditText().getText().toString()) * 100) /  Double.parseDouble(totalMarksCard1Input.getEditText().getText().toString()));
            //per = 65.65242 ;
            percentageCard1Input.getEditText().setText(df2.format(per).toString());

        }



    }


    void setPercentagecard2(){

        if(!(obtainedMarksCard2Input.getEditText().getText().toString().equals("")) || !(totalMarksCard2Input.getEditText().getText().toString().equals(""))){
            if(obtainedMarksCard2Input.getEditText().getText().toString().equals("")){
                obtainedMarksCard2Input.setError("Enter Obtained Marks Plz");
                return ;
            }
            if(totalMarksCard2Input.getEditText().getText().toString().equals("")){
                totalMarksCard2Input.setError("Enter Total Marks Plz");
                return ;
            }

            allCardDone++ ;
            //Toast.makeText(Uni_Info_Activity.this, "In If" , Toast.LENGTH_LONG).show();
            DecimalFormat df2 = new DecimalFormat(".##");
            double per = 0.0, obt = 0.0 , total = 0.0;
            //obt = obtainedMarksCard1Input.getEditText().getText();
            per = ((Double.parseDouble(obtainedMarksCard2Input.getEditText().getText().toString()) * 100) /  Double.parseDouble(totalMarksCard2Input.getEditText().getText().toString()));
            //per = 65.65242 ;
            percentageCard2Input.getEditText().setText(df2.format(per).toString());

        }



    }



    void setPercentagecard3(){

        if(!(obtainedMarksCard3Input.getEditText().getText().toString().equals("")) || !(totalMarksCard3Input.getEditText().getText().toString().equals(""))){
            if(obtainedMarksCard3Input.getEditText().getText().toString().equals("")){
                obtainedMarksCard3Input.setError("Enter Obtained Marks Plz");
                return ;
            }
            if(totalMarksCard3Input.getEditText().getText().toString().equals("")){
                totalMarksCard3Input.setError("Enter Total Marks Plz");
                return ;
            }

            allCardDone++ ;
            //Toast.makeText(Uni_Info_Activity.this, "In If" , Toast.LENGTH_LONG).show();
            DecimalFormat df2 = new DecimalFormat(".##");
            double per = 0.0, obt = 0.0 , total = 0.0;
            //obt = obtainedMarksCard1Input.getEditText().getText();
            per = ((Double.parseDouble(obtainedMarksCard3Input.getEditText().getText().toString()) * 100) /  Double.parseDouble(totalMarksCard3Input.getEditText().getText().toString()));
            //per = 65.65242 ;
            percentageCard3Input.getEditText().setText(df2.format(per).toString());

        }



    }

    void assign(){
        uniNameText = findViewById(R.id.uni_text_uniNme);
        if(getIntent().hasExtra("uniName")){
            uniNameText.setText(getIntent().getExtras().getString("uniName"));
        }

        if(getIntent().hasExtra("entryTest%")){
            entryTestWeightage = getIntent().getExtras().getInt("entryTest%");
        }
        else{
            entryTestWeightage = 0 ;
        }

        if(getIntent().hasExtra("fsc%")){
            fscWeightage = getIntent().getExtras().getInt("fsc%");
        }
        else{
            fscWeightage = 0 ;
        }


        if(getIntent().hasExtra("matric%")){
            matricWeightage = getIntent().getExtras().getInt("matric%");
        }
        else{
            matricWeightage = 0 ;
        }




        aggregateText = findViewById(R.id.uni_text_aggregate);

        obtainedMarksCard1Input = findViewById(R.id.uni_card1_obtained);
        obtainedMarksCard2Input = findViewById(R.id.uni_card2_obtained);
        obtainedMarksCard3Input = findViewById(R.id.uni_card3_obtained);

        totalMarksCard1Input = findViewById(R.id.uni_card1_total);
        totalMarksCard2Input = findViewById(R.id.uni_card2_total);
        totalMarksCard3Input = findViewById(R.id.uni_card3_total);

        percentageCard1Input = findViewById(R.id.uni_card1_percentage);
        percentageCard2Input = findViewById(R.id.uni_card2_percentage);
        percentageCard3Input = findViewById(R.id.uni_card3_percentage);

        done = findViewById(R.id.uni_btn_done);
    }

    void removeErrorsOnInputLayouts(){
        totalMarksCard1Input.getEditText().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMarksCard1Input.setErrorEnabled(false);
            }
        });

        totalMarksCard1Input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMarksCard1Input.setErrorEnabled(false);
            }
        });

        obtainedMarksCard1Input.getEditText().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtainedMarksCard1Input.setErrorEnabled(false);
            }
        });




        totalMarksCard2Input.getEditText().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMarksCard2Input.setErrorEnabled(false);
            }
        });

        obtainedMarksCard2Input.getEditText().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtainedMarksCard2Input.setErrorEnabled(false);
            }
        });




        totalMarksCard3Input.getEditText().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMarksCard3Input.setErrorEnabled(false);
            }
        });

        obtainedMarksCard3Input.getEditText().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtainedMarksCard3Input.setErrorEnabled(false);
            }
        });
    }

    void setAggregateWithNumbers(){
        DecimalFormat df2 = new DecimalFormat(".##");
        double aggregate = 0.0, temp ;
        double e = (Double.parseDouble(obtainedMarksCard1Input.getEditText().getText().toString()) / Double.parseDouble(totalMarksCard1Input.getEditText().getText().toString())) ;
        double f = (Double.parseDouble(obtainedMarksCard2Input.getEditText().getText().toString()) / Double.parseDouble(totalMarksCard2Input.getEditText().getText().toString()));
        double m = (Double.parseDouble(obtainedMarksCard3Input.getEditText().getText().toString()) / Double.parseDouble(totalMarksCard3Input.getEditText().getText().toString()));

        aggregate =((e * entryTestWeightage) + (f * fscWeightage)  +  (m * matricWeightage));


        aggregateText.setVisibility(View.VISIBLE);
        aggregateText.setText("Your Aggregate : " + df2.format(aggregate).toString());
    }

    void setAggregateWithPercentage(){
        double entryTestPercentage =  0 ;
        double fscPercentage = 0;
        double matricPercentage = 0 ;
        if(!(percentageCard1Input.getEditText().getText().toString().equals(""))){
            entryTestPercentage = ((Double.parseDouble(percentageCard1Input.getEditText().getText().toString())) / 100) ;
        }

        if(!(percentageCard2Input.getEditText().getText().toString().equals(""))){
            fscPercentage = ((Double.parseDouble(percentageCard2Input.getEditText().getText().toString())) / 100) ;

        }

        if(!(percentageCard3Input.getEditText().getText().toString().equals(""))){
            matricPercentage = ((Double.parseDouble(percentageCard3Input.getEditText().getText().toString())) / 100);

        }





        DecimalFormat df2 = new DecimalFormat(".##");
        double aggregate = 0.0 ;
        aggregate =((entryTestPercentage * entryTestWeightage) + (fscPercentage * fscWeightage)  +  (matricPercentage * matricWeightage));
        aggregateText.setVisibility(View.VISIBLE);
        aggregateText.setText("Your Aggregate : " + df2.format(aggregate).toString());


    }
}
