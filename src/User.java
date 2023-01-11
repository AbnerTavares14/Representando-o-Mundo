public class User {
    private String name;
    private String email;
    private String password;
    private String cpf;
    private Curso curso = new Curso();

    public User(String name, String email, String password, String cpf) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
    }

    public User(String name, String email, String password, String cpf, String nomeCurso, int periodo, int ingresso)
            throws Exception {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.curso.setName(nomeCurso);
        this.curso.setIngresso(ingresso);
        this.curso.setPeriodo(periodo);
    }

    public String getCurso() {
        return this.curso.getName();
    }

    public int getIngresso() {
        return this.curso.getIngresso();
    }

    public int getPeriodo() {
        return this.curso.getPeriodo();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getPassword() {
        return this.password;
    }
}
