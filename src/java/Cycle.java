public class Cycle {
    public static void main(String[] args) {
        int i = 5;
        while (i>0){
            System.out.println("Это внутри цикла");
            i--;
        }
        System.out.println("Это выполнтся после того, как весь цикл выполнится и завершится");
    }
}
