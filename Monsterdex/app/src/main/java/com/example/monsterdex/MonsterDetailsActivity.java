package com.example.monsterdex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonsterDetailsActivity extends AppCompatActivity {

    private ImageView monsterImageView;
    private TextView monsterNameText;
    private TextView monsterIDText;
    private TextView typeValueText;
    private TextView attackValueText;
    private TextView defenseValueText;
    private TextView speedValueText;
    private TextView specialValueText;
    private TextView specialTypeValueText;
    private int monsterID;

    List<String> monsterCrotone;
    List<String> monsterDragonewt;
    List<String> monsterGorimite;
    List<String> monsterHorns;
    List<String> monsterNeedles;
    List<String> monsterPeliral;
    List<String> monsterQuivark;
    List<String> monsterRamodo;
    List<String> monsterSpinpion;
    List<String> monsterSteelupine;

    ArrayList<List<String>> monsterList = new ArrayList<List<String>>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsterdetails);

        monsterImageView = findViewById(R.id.monsterImageView);
        monsterNameText = findViewById(R.id.monsterNameTextView);
        monsterIDText = findViewById(R.id.numberValueSimpleTextView);
        typeValueText = findViewById(R.id.typeValueSimpleTextView);
        attackValueText = findViewById(R.id.attackValueSimpleTextView);
        defenseValueText = findViewById(R.id.defenseValueSimpleTextView);
        speedValueText = findViewById(R.id.speedValueSimpleTextView);
        specialValueText = findViewById(R.id.specialValueSimpleTextView);
        specialTypeValueText = findViewById(R.id.specialTypeValueSimpleTextView);

        Button nextButton = findViewById(R.id.nextBtn);
        Button previousButton = findViewById(R.id.previousBtn);

        fillMonsterDetails();

        nextButton.setOnClickListener(view -> nextMonsterScreen());
        previousButton.setOnClickListener(view -> previousMonsterScreen());
    }

    public void nextMonsterScreen(){

        Log.w("TAG", "next"); // see output in 4: Run console tab
        //monsterIDText = "002";
        int monsterID = Integer.parseInt(monsterIDText.getText().toString());

        monsterID++;
        if (monsterID > 10){
            monsterID = 1;
        }

        if (monsterID == 10){
            monsterIDText.setText("010");
        } else {
            monsterIDText.setText("00"+String.valueOf(monsterID));
        }

        updateMonsterStats(monsterID);

    }

    public void previousMonsterScreen(){
        Log.w("TAG", "previous");  // see output in 4: Run console tab
        int monsterID = Integer.parseInt(monsterIDText.getText().toString());

        monsterID--;
        if (monsterID < 1){
            monsterID = 10;
        }

        if (monsterID == 10){
            monsterIDText.setText("010");
        } else {
            monsterIDText.setText("00"+String.valueOf(monsterID));
        }

        updateMonsterStats(monsterID);

    }

    public void updateMonsterStats(int monsterID) {
        List<String> monster = null;
        switch(monsterID) {
            case (1):
                monster = monsterCrotone;
                monsterImageView.setImageResource(R.drawable.crotone);
                break;
            case (2):
                monster = monsterDragonewt;
                monsterImageView.setImageResource(R.drawable.dragonewt);
                break;
            case (3):
                monster = monsterGorimite;
                monsterImageView.setImageResource(R.drawable.gorimite);
                break;
            case (4):
                monster = monsterHorns;
                monsterImageView.setImageResource(R.drawable.horns);
                break;
            case (5):
                monster = monsterNeedles;
                monsterImageView.setImageResource(R.drawable.needles);
                break;
            case (6):
                monster = monsterPeliral;
                monsterImageView.setImageResource(R.drawable.peliral);
                break;
            case (7):
                monster = monsterQuivark;
                monsterImageView.setImageResource(R.drawable.quivark);
                break;
            case (8):
                monster = monsterRamodo;
                monsterImageView.setImageResource(R.drawable.ramodo);
                break;
            case (9):
                monster = monsterSpinpion;
                monsterImageView.setImageResource(R.drawable.spinpion);
                break;
            case (10):
                monster = monsterSteelupine;
                monsterImageView.setImageResource(R.drawable.steelupine);
                break;
        }

        monsterNameText.setText(monster.get(1));
        typeValueText.setText(monster.get(2));
        attackValueText.setText(monster.get(3));
        defenseValueText.setText(monster.get(4));
        speedValueText.setText(monster.get(5));
        specialValueText.setText(monster.get(6));
        specialTypeValueText.setText(monster.get(7));
    }

    public void fillMonsterDetails(){
        // update name, drawable name, type, atk, def, spd, spc, spc type

        monsterCrotone = Arrays.asList(
                "Crotone", "crotone", "Normal",
                "550", "150", "25",
                "Death Breath", "Condition");
        monsterList.add(monsterCrotone);
        monsterDragonewt = Arrays.asList(
                "Dragonewt", "dragonewt", "Fire",
                "600", "120", "30",
                "Glare", "Debuff");
        monsterList.add(monsterDragonewt);
        monsterGorimite = Arrays.asList(
                "Gorimite", "gorimite", "Plant",
                "400", "160", "15",
                "Seed", "Poison");
        monsterList.add(monsterGorimite);
        monsterHorns = Arrays.asList(
                "Horns", "horns", "Fire",
                "250", "120", "73",
                "Charge", "Attack");
        monsterList.add(monsterHorns);
        monsterNeedles = Arrays.asList(
                "Needles", "needles", "Dark",
                "500", "125", "35",
                "Stab", "Attack");
        monsterList.add(monsterNeedles);
        monsterPeliral = Arrays.asList(
                "Peliral", "peliral", "Fire",
                "600", "125", "15",
                "Razor Wing", "Attack");
        monsterList.add(monsterPeliral);
        monsterQuivark = Arrays.asList(
                "Quivark", "quivark", "Normal",
                "650", "100", "32",
                "Shriek", "Debuff");
        monsterList.add(monsterQuivark);
        monsterRamodo = Arrays.asList(
                "Ramodo", "ramodo", "Dragon",
                "400", "80", "80",
                "Intimidate", "Condition");
        monsterList.add(monsterRamodo);
        monsterSpinpion = Arrays.asList(
                "Spinpion", "spinpion", "Poison",
                "50", "160", "125",
                "Sting", "Poison");
        monsterList.add(monsterSpinpion);
        monsterSteelupine = Arrays.asList(
                "Steelupine", "steelupine", "Water",
                "550", "35", "110",
                "Bubble", "Attack");
        monsterList.add(monsterSteelupine);
    }

}