package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result="";
        int counter = 1;
        for(int i=1;i<numberOfRows;i++) {

            for (int j = 1; j <= counter;j++) {
                result += String.format("*");
            }
            result += String.format("\n");
            counter++;
        }
        return result;
    }

    public static String getRow(int numberOfStars) {
        String result="";

        for(int i=1;i<=numberOfStars;i++){
            result+=String.format("*");
        }
        return result;
    }

    public static String getSmallTriangle() {
        String result="";
        int counter = 1;
        for(int i=1;i<5;i++) {

            for (int j = 1; j <= counter;j++) {
                result += String.format("*");
            }
            result += String.format("\n");
            counter++;
        }
        return result;
    }

    public static String getLargeTriangle() {
        String result="";
        int counter = 1;
        for(int i=1;i<10;i++) {

            for (int j = 1; j <= counter;j++) {
                result += String.format("*");
            }
            result += String.format("\n");
            counter++;
        }
        return result;
    }
}
