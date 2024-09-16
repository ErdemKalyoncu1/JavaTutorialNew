public class Main {
    public static void main(String[] args) {
        //220-284 = kendileri hariç pozitif bölen sayilari toplami birbirne esit olan sayilar Arkadas sayilardir.

        int number1=1184;
        int number2=1210;
        int pozitifBolenToplami1=0;
        int pozitifBolenToplami2=0;

        for(int i=1; i<number1; i++){
            if(number1%i==0){
                pozitifBolenToplami1+=i;
            }
        }
        for(int i=1; i<number2; i++){
            if(number2%i==0){
                pozitifBolenToplami2+=i;
            }
        }

        if(pozitifBolenToplami1==number2 &+ pozitifBolenToplami2==number1){
            System.out.println(number1+"-----"+number2+" "+"Sayilari arkadas sayilardir!");
        }else{
            System.out.println(number1+"-----"+number2+" "+"Sayilari arkadas sayi değildir!");

        }
    }
}