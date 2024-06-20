import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numF = sc.nextInt();
        int horasF = sc.nextInt();
        sc.nextLine();
        Double salF = Double.parseDouble(sc.nextLine());

        double salary = (horasF * salF);
        System.out.println("NUMBER = " + numF);
        System.out.printf("SALARY = U$ %.2f\n", salary);

    }
}
