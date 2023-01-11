public class App {
    public static void main(String[] args) throws Exception {
        User user2 = new User("Abner", "abner@gmail.com", "123456", "123.456.789-10", "C.Comp", 1, 2022);
        System.out.println("Nome: " + user2.getName() + "\nCPF: " + user2.getCpf() + "\nEmail: " + user2.getEmail()
                + "\nPassword: " + user2.getPassword() + "\nCurso: " + user2.getCurso() + "\nIngresso: "
                + user2.getIngresso() + "\nPeriodo: " + user2.getPeriodo());
    }
}
