public class appEscola {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Fulano","f@gmail.com",9);
        Estudante e2 = new Estudante("Beltrano","b@mail.com",19);
        Estudante e3 = new Estudante("Ciclano","c@mail.com",123422);

        Turma turma = new Turma("1TADS","Tecnologia ADS");
        turma.addEstudante(e1);
        turma.addEstudante(e2);
        turma.addEstudante(e3);

        System.out.println("=== Lista de Estudantes ===");
        for(Estudante e: turma.getEstudantes()){
            System.out.printf("%s - %s - %s \n", e.getNome(), e.getEmail(), e.getCelular());
        }
        System.out.println();
        Estudante estudante = turma.getEstudantePorNome("Beltrano");
        if(estudante != null){
            turma.delEstudante(estudante);
        }
        for(Estudante e: turma.getEstudantes()){
            System.out.printf("%s - %s - %s \n", e.getNome(), e.getEmail(), e.getCelular());
        }
    }
}
