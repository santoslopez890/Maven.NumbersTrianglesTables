package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
    String result ="";
        for (int i = start; i < stop; i++) {//looping through numbers
            if (i % 2 == 0) {
                result +=String.format("%d",i);
            }

        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result ="";
        for (int i = start; i < stop; i++) {//looping through numbers
            if (i % 2 == 1) {
                result +=String.format("%d",i);
            }

        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result ="";
        int result2=1;
        int squarednums=0;
        for (int i = start; i < stop; i += step) {//looping through numbers

                squarednums = i*i;//25
                result2 += squarednums*result2;

                result += String.format("%d",squarednums);
        }
        return result;
    }

    public static String getRange(int start) {

        String result ="";
        for (int i = 0; i < start; i++) {//looping through numbers

                result +=String.format("%d",i);


        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result ="";
        for (int i = start; i < stop; i++) {//looping through numbers

            result +=String.format("%d",i);


        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result ="";
        for (int i = start; i < stop; i+= step) {//looping through numbers

            result +=String.format("%d",i);


        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result ="";
        int result2=1;
        int squarednums=0;
        for (int i = start; i < stop; i += step) {//looping through numbers

            squarednums = i*i;//25
            result2 += squarednums*result2;

            result += String.format("%d",squarednums);
        }
        return result;
    }
}
