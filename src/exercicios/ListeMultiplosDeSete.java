package exercicios;

public class ListeMultiplosDeSete {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
