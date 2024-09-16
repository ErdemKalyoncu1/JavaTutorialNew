public class Main {
    public static void main(String[] args) {

        //double[] myList =new double[4];
        /*double[] myList = {1.2, 3.4, 5.6, 6.7};
        for(double number:myList){
            System.out.println(number);


        /*double totalDifference=0;

            for (int i=0;i<myList.length;i++) {
                for (int j = i+1; j < myList.length; j++) {
                    double difference = myList[i] - myList[j];
                    System.out.println(totalDifference);
                     totalDifference += difference;

                }
            }
        System.out.println(totalDifference);*/
        double[] myList = {1.2, 3.4, 5.6, 6.7, };

        double max = myList[0];
        double total = 0;
        double multiplication = 1;
        double totalDifference=0;
        double difference;
        double initialDifference=myList[0]-myList[1];


        for(int i=2;i<myList.length;i++){

            difference=initialDifference-myList[i];
            initialDifference=difference;
            System.out.println(initialDifference);



            System.out.println(i);
            //for(int j=1;j<myList.length;j++){



        }







        /*for (int i=0;i<myList.length;i++) {
            System.out.println("Listenin "+i+". elemanı "+myList[i]);
            *//*if (max < i) {
                max = i;
            }*//*

            for (int j=i+1;j<myList.length;j++){
                System.out.println("Listenin "+j+ ". elemanı= "+myList[j]);
                difference=myList[i]-myList[j];
                System.out.println("Fark= "+difference);

                totalDifference+=difference;

                System.out.println("Toplam Fark= "+totalDifference);
                break;
            }*/
           // total += number;
           // multiplication = multiplication * number;

        //System.out.println(total);
        //System.out.println(multiplication);
        //System.out.println(totalDifference);
        //System.out.println(max);

    }
}
