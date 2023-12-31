package com.example.projectwjp;


import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Actor {
    public int getDiffLevel() {
        return diffLevel;
    }

    private int diffLevel = 1;
    private  Type type = Type.Dodawanie;
    private int enemyHP = 100;

    public int[] getNumbers() {
        return numbers;
    }

    private int [] numbers;

    public String getEquation() {
        return equation;
    }

    private String equation = "lmao";
    public int getAnswer() {
        return answer;
    }

    private  int answer = 0;
    Random random;

    protected ArrayList<Obstacle> obstacles;

    public Enemy(int diffLevel,Type type) {
        this.type = type;
        this.diffLevel = diffLevel;
        obstacles = new ArrayList<>();
        enemyHP += 20*diffLevel;
        random = new Random();
        numbers = new int [diffLevel+2];
        setEquation();

        //obstacles = new Obstacle[diffLevel];

    }
    @Override
    public void onHit() {
        enemyHP-=10;
    }

    @Override
    public void draw(Canvas canvas) {

    }


    public void setEquation(){
        random = new Random();
        int bounds = 10;
        int x = random.nextInt(bounds)+1;

        int y = random.nextInt(bounds)+1;

        switch (type){
            case Dodawanie:
                answer = x+y;

                equation = x+" + "+y;
                break;
            case Odejmowanie:
                if(x>y){
                    answer = x-y;

                    equation = x+" - "+y;
                }
                else{
                    answer = y-x;
                    equation = y+" - "+x;
                }

                break;
            case Mnozenie:
                bounds = 5*diffLevel;
                x = random.nextInt(bounds)+1;
                y = random.nextInt(bounds)+1;
                answer = x*y;

                equation = x+" * "+y;
                break;
            case Dzielenie:
                bounds = 5*diffLevel;
                x = random.nextInt(bounds)+1;
                y = random.nextInt(bounds)+1;
                answer = x/y;

                equation = x+" / "+y;
                break;
            default:
                answer = 99;
                equation = x+" ? "+y;
        }

        numbers[0]=answer;
        for(int i = 1;i<diffLevel+2;i++){

            numbers[i]=random.nextInt(bounds)+1;

            while(numbers[i]==answer)
            {
                numbers[i]=random.nextInt(bounds)+1;
            }
        }
    }


    public int getEnemyHP() {
        return enemyHP;
    }
    public Type getType(){
        return type;
    }
    public void setNumbers(){

        numbers[0]=answer;
        for(int i = 1;i<diffLevel+2;i++){

            numbers[i]=random.nextInt(answer+20);

            while(numbers[i]==answer)
            {
                numbers[i]=random.nextInt(answer+20);
            }
        }

    }


}
