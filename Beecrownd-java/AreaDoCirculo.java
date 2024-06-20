import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double raio = Double.parseDouble(scanner.nextLine());
    double n = 3.14159;
    double area = n * (raio * raio);
    System.out.println(String.format("A=%.4f", area)); 
}
}
