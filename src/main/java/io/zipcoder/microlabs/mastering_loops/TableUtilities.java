package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result ="";

        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                int product = i*j;
                if (product<10){
                    System.out.print("   "+product);
                    result +=String.format("  %d |",product);
                }
                else if(product<100){
                    System.out.print(" "+product);
                    result +=String.format(" %d |",product);
                }
                else {
                    System.out.print(" "+product);
                    result +=String.format("%d |",product);
                }
            }
            result +=String.format("\n");
            System.out.println();
        }
       // String result;
        //string cat didnt give me enough controll
       // result =String.format("%s %.2f %.2f %.2f",name,grossPay,deduction,netPay);

        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result ="";

        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                int product = i*j;
                if (product<10){
                    System.out.print("   "+product);
                    result +=String.format("  %d |",product);
                }
                else if(product<100){
                    System.out.print(" "+product);
                    result +=String.format(" %d |",product);
                }
                else {
                    System.out.print(" "+product);
                    result +=String.format("%d |",product);
                }
            }
            result +=String.format("\n");
            System.out.println();
        }


        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result ="";



        for (int i=1;i<=tableSize;i++){
            for (int j=1;j<=tableSize;j++){
                int product = i*j;
                if (product<10){
                    System.out.print("   "+product);
                    result +=String.format("  %d |",product);
                }
                else if(product<100){
                    System.out.print(" "+product);
                    result +=String.format(" %d |",product);
                }
                else {
                    System.out.print(" "+product);
                    result +=String.format("%d |",product);
                }
            }
            result +=String.format("\n");
            System.out.println();
        }


        return result;
    }
}
