public class Main {
    public static void main(String[] args) {

        String mesaj="         Bugün hava çok güzel";

        System.out.println(mesaj);

       /* System.out.println("Eleman sayısı ="+mesaj.length());
        System.out.println("5. eleman= "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın! "));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("l"));

        char[] karakterler=new char[5];
        mesaj.getChars(0,4, karakterler,1);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("va"));
        System.out.println(mesaj.lastIndexOf('a'));*/
        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,5));


        for(String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }
        //Dbye arama ifadesi gönderdiğimizde kullanılır.
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}