import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do usuário");
        String name = in.nextLine();
        System.out.println("Digite o email do usuário");
        String email = in.nextLine();
        System.out.println("Digite a senha do usuário");
        String password = in.nextLine();
        System.out.println("Digite o cpf do usuário");
        String cpf = in.nextLine();
        System.out.println("Digite o curso do usuário");
        String curso = in.nextLine();
        System.out.println("Digite o período do curso");
        int periodo = in.nextInt();
        System.out.println("Digite o ano de ingresso no curso");
        int ingresso = in.nextInt();

        User user2 = new User(name, email, password, cpf, curso, periodo, ingresso);
        System.out.println("Nome: " + user2.getName() + "\nCPF: " + user2.getCpf() + "\nEmail: " + user2.getEmail()
                + "\nPassword: " + user2.getPassword() + "\nCurso: " + user2.getCurso() + "\nIngresso: "
                + user2.getIngresso() + "\nPeriodo: " + user2.getPeriodo());
    }
}
