package com.example.peter.caffeinecareful;

/**
 * Created by peter on 12/8/2016.
 */

public class User {

    static int limit = 340;
    static int caffieneLevel = 0;
    static int ans = 0;

    protected static String getLevelString(){
        return ""+caffieneLevel+"%";
    }

    protected static void addCaffiene(int add){
        caffieneLevel = caffieneLevel + add;
    }

    protected static int predictMorning(int tired, int hoursUntilLunch, int probSoda) {
        if (tired > 4) {
            if(hoursUntilLunch >= 2){
                if(probSoda <= 2){
                    return 1;
                }
            }
        } else {
            return 0;
        }


        return ans;
    }
}
