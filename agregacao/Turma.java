import java.util.List;
import java.util.ArrayList;
public class Turma {
    private String nome;
    private String curso;
    private List<Estudante> estudantes;
    
    public Turma(){
        this.nome = "";
        this.curso = "";
        this.estudantes = new ArrayList<>();
    }

    public Turma(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
        this.estudantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Estudante> getEstudantes(){
        return this.estudantes;
    }

    public void addEstudante(Estudante estudante){
        this.estudantes.add(estudante);
    }

    public void delEstudante(Estudante estudante){
        this.estudantes.remove(estudante);
    }

    public Estudante getEstudantePorNome(String nome){
        for (Estudante e : this.estudantes) {
            if(e.getNome().equalsIgnoreCase(nome)){
                return e;
            }
        }
        return null;
    }
}
