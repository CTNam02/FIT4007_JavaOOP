public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= (100/7); i++) {
            sum += i*7;
        }
        System.out.println("Ket qua: "+sum);
    }
}