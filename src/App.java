import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String alfa = sc.nextLine();
            String[] arr = alfa.split("");

            StringBuilder st = new StringBuilder();
            int qtd = sc.nextInt();
            for (int i = 0; i < qtd; i++) {
                int b = sc.nextInt();
                st.append(arr[b - 1]);
            }

            System.out.println(st.toString());
            sc.nextLine();

        }

        sc.close();
    }
}
