package cn.mores.Anti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomCalculation {

    public static int Answer1;
    public static int Answer2;
    public static int Answer3;
    public static int Answer4;
    public static int TrueAnswer;

    public static int ValueA;
    public static int ValueB;

    List<Integer> list= new ArrayList<>();

    public int RandomNum(int a){
        Random random = new Random();
        a = random.nextInt(100);
        return a;
    }

    public int RandomTrueSlot(){
        Random random = new Random();
        return random.nextInt(3)+1;
    }

    public List<Integer> RandomList() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.shuffle(list);
        return list;
    }

    public int getTrueAnswer(){
        RandomNum(ValueA);
        RandomNum(ValueB);
        TrueAnswer=ValueA+ValueB;
        return TrueAnswer;
    }

    public void SetTrueAnswer(){
        int trueSlot=RandomTrueSlot();
        int trueAnswer=getTrueAnswer();
        switch (trueSlot){
            case 1:
                Answer1=trueAnswer;
                break;
            case 2:
                Answer2=trueAnswer;
                break;
            case 3:
                Answer3=trueAnswer;
                break;
            case 4:
                Answer4=trueAnswer;
                break;
        }
    }

    public static String getFormula(){
        return (ValueA+"+"+ValueB);
    }
}
