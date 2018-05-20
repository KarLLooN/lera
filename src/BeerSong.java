public class BeerSong {
    public static void main(String[] args) {
        int beernum = 99;
        String word = "Бутылок (бутылки)";
        while (beernum > 0)
        {
            if (beernum == 1) {
                word = "Бутылка";
        }
            System.out.println(beernum + " " + word + " пива на стене");
            System.out.println(beernum + " " + word + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beernum = beernum - 1;
        }
        if (beernum > 0){
            System.out.println(beernum + " " + word + " пива на стене");
        }
        else {
            System.out.println("нет бутылок пива на стене");
        }
    }
}