public class Main {
    public static void main(String[] args) {

       String [][] sehirler=new String[3][3];

       sehirler[0][0]="İstanbul";
        sehirler[0][1]="Adana";
        sehirler[0][2]="Ankara";
        sehirler[1][0]="Beypazarı";
        sehirler[1][1]="İstanbul";
        sehirler[1][2]="Muğla";
        sehirler[2][0]="İstanbul";
        sehirler[2][1]="İstanbul";
        sehirler[2][2]="Sivas";

        for(int i=0;i<=2;i++){
            System.out.println("**************************");

            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}