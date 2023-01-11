public class Curso {
    private String name;
    private int ingresso;
    private int periodo;

    public Curso() {
        this.name = null;
        this.ingresso = 0;
        this.periodo = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngresso(int ingresso) throws Exception {
        if (ingresso < 2008 || ingresso > 2023) {
            throw new Exception("ingresso precisa ser maior que 2008 e menor que 2023");
        }
        this.ingresso = ingresso;
    }

    public void setPeriodo(int periodo) throws Exception {
        if (periodo < 1 || periodo > 10) {
            throw new Exception("periodo não pode ser menor do que 1 e nem maior do que 10");
        }
        this.periodo = periodo;
    }

    public String getName() {
        return this.name;
    }

    public int getPeriodo() {
        return this.periodo;
    }

    public int getIngresso() {
        return this.ingresso;
    }
}
