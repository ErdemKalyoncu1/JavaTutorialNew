public class Main {
    public static void main(String[] args) {
      /*  int[] sayi = {7,8,9};

        for(int i=0;i<3;i++){
            System.out.println(sayi[i]);
        }*/
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Erdem";
        ogrenciler[1] = "Ali";
        ogrenciler[2] = "Ayşe";

      /*  for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }*/

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}