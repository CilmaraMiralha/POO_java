public class appFilme {
    public static void main(String args[]){
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Filme filme3 = new Filme();

        filme1.titulo = "A Hora do Rush";
        filme1.genero = "Comédia de ação";
        filme1.ano = 1998;
        filme1.duracao = 98;
        filme1.sinopse = "A filha de um diplomata chinês é sequestrada em Los Angeles e o cônsul chama o inspetor Lee em Hong Kong para ajudar o FBI com o caso. A agência norte-americana não se importa com Lee e o deixa de lado no Departamento de Polícia de Los Angeles, pedindo ao detetive James Carter que o vigie. Apesar de Lee e Carter não se suportarem, eles resolvem trabalhar juntos para resolver o caso por conta própria quando descobrem que foram abandonados tanto pelo FBI quanto pela polícia.";
        filme1.preco = 7.90;

        filme2.titulo = "A Hora do Rush 2";
        filme2.genero = "Comédia de ação";
        filme2.ano = 2001;
        filme2.duracao = 90;
        filme2.sinopse = "Um atentado a bomba na embaixada dos Estados Unidos em Hong Kong mata dois agentes que investigavam contrabando de dinheiro. Os inspetores Lee e James Carter caçam o autor intelectual do ataque.";
        filme2.preco = 14.90;

        filme3.titulo = "A Hora do Rush 3";
        filme3.genero = "Comédia de ação";
        filme3.ano = 2007;
        filme3.duracao = 91;
        filme3.sinopse = "Depois de um atentado contra o embaixador Han, Lee e Carter viajam para Paris. Lá, eles precisam proteger uma francesa que sabe demais sobre os líderes da Tríade. Eles também enfrentam a máfia chinesa de Paris e um amigo de infância de Lee.";
        filme3.preco = 12.90;

        System.out.println("Título: "+filme1.titulo);
        System.out.println("Gênero: "+filme1.genero);
        System.out.println("Ano: "+filme1.ano);
        System.out.println("Duração: "+filme1.duracao);
        System.out.println("Sinopse: "+filme1.sinopse);
        System.out.println("Preço: "+filme1.preco);

        System.out.println("Título: "+filme2.titulo);
        System.out.println("Gênero: "+filme2.genero);
        System.out.println("Ano: "+filme2.ano);
        System.out.println("Duração: "+filme2.duracao);
        System.out.println("Sinopse: "+filme2.sinopse);
        System.out.println("Preço: "+filme2.preco);

        System.out.println("Título: "+filme3.titulo);
        System.out.println("Gênero: "+filme3.genero);
        System.out.println("Ano: "+filme3.ano);
        System.out.println("Duração: "+filme3.duracao);
        System.out.println("Sinopse: "+filme3.sinopse);
        System.out.println("Preço: "+filme3.preco);

        System.out.println("\nFilme mais caro:\n");
        if(filme1.preco>filme2.preco && filme1.preco>filme3.preco){
            System.out.println("Título: "+filme1.titulo);
            System.out.println("Gênero: "+filme1.genero);
            System.out.println("Ano: "+filme1.ano);
            System.out.println("Duração: "+filme1.duracao);
            System.out.println("Sinopse: "+filme1.sinopse);
            System.out.println("Preço: "+filme1.preco);
        } else if(filme2.preco>filme1.preco && filme2.preco>filme3.preco){
            System.out.println("Título: "+filme2.titulo);
            System.out.println("Gênero: "+filme2.genero);
            System.out.println("Ano: "+filme2.ano);
            System.out.println("Duração: "+filme2.duracao);
            System.out.println("Sinopse: "+filme2.sinopse);
            System.out.println("Preço: "+filme2.preco);
        } else {
            System.out.println("Título: "+filme3.titulo);
            System.out.println("Gênero: "+filme3.genero);
            System.out.println("Ano: "+filme3.ano);
            System.out.println("Duração: "+filme3.duracao);
            System.out.println("Sinopse: "+filme3.sinopse);
            System.out.println("Preço: "+filme3.preco);
        }


    }
}
