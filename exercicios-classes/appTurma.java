public class appTurma {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(982953842,"Marcos",19,"Informática",9.8f);
        Aluno aluno2 = new Aluno(982953852,"Cecília",20,"Informática",8.8f);
        Aluno aluno3 = new Aluno(982953982,"Clarice",18,"Informática",10f);
        Aluno aluno4 = new Aluno(982953898,"Manoel",19,"Informática",5.8f);
        Aluno aluno5 = new Aluno(982953900,"Tobias",20,"Informática",7.8f);

        float mediaTurma = (aluno1.mediaGeral + aluno2.mediaGeral + aluno3.mediaGeral + aluno4.mediaGeral + aluno5.mediaGeral)/5;

        System.out.println("A média da turma é de: "+mediaTurma);
    }
}
