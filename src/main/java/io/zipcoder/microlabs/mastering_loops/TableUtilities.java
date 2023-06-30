package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result ="";

        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                int product = i*j;
                if (product<10){
                    System.out.print("   "+product);
                }
                else{
                    System.out.print(" "+product);
                }
            }
            System.out.println();
        }


        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result ="";

        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                int product = i*j;
                if (product<10){
                    System.out.print("   "+product);
                }
                else{
                    System.out.print(" "+product);
                }
            }
            System.out.println();
        }


        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result ="";

        for (int i=1;i<=tableSize;i++){
            for (int j=1;j<=20;j++){
                int product = i*j;
                if (product<20){
                    System.out.print("   "+product);
                }
                else{
                    System.out.print(" "+product);
                }
            }
            System.out.println();
        }


        return result;
    }
}
