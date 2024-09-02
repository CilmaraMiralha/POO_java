public class Estudante {
    private String nome;
    private String email;
    private long celular;

    public Estudante(){}

    public Estudante(String nome, String email, long celular){
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getCelular() {
        return celular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }    
}
