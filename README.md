# Academico

### Descrição
Desenvolvido a partir dos paradigmas da POO, Programação Orientada a Objeto; O projeto foi criado para auxiliar o gerenciamento de uma Instituição Acadêmica.
  * Principais Funcionalidades :
    * Gestão de Alunos: Cadastro, consulta e atualização de informações dos alunos.
    * Gestão de Professores: Registro e atualização de dados dos professores.
    * Avaliações e Notas: Controle de provas, atribuição de notas e acompanhamento do desempenho acadêmico dos alunos.
    * Cursos e Disciplinas: Cadastro, consulta e atualização de informações de Cursos e Disciplinas.
  * Estrutura do Projeto :
    * O código-fonte segue os princípios sólidos da Programação Orientada a Objetos, proporcionando uma arquitetura modular e de fácil compreensão.
    * As classes são organizadas de forma a refletir a estrutura da instituição acadêmica, tornando a manutenção e a expansão do sistema mais intuitivas.
    * Presença de Classes Testes para a facilitação do entendimento das funcionalidades.

### Exemplos de Funcionalidade

* Tratamento de acordo com o Gênero :
  * A classe Alunos e Professores apresentam um atributo que define o seu gênero.
  * True == Feminino e False == Masculino.
  * Ao instanciar o método toString(), o método printa Aluna e Professora, para pessoas do gênero feminino, e Aluno e Professor, para pessoas do gênero masculino.
    
```java
public class Main {
  public static void main(String[] args) {
    Professores p1 = new Professores("Lara", "lara@gmail.com",true);
    Alunos a1 = new Alunos("Lara", null, "lara@gmail.com",4, null,true,p1);
    a1.toString();
    p1.toString()
  }
}
public class Alunos {
  public String toString() {
   return "\n" + this.matricula + " - " + tratamento()  + this.nome + "\n" + "(" + this.email + ")" ;
  }
}
public class Professores {
  public String toString() {
    return  tratamento() + nome + "\n" + "(" + email + ")";
  }
}
```
* Relação Professor e Aluno :
  * Cada Professor apresenta um conjunto de Alunos.
  * É necessário um método para vincular uma lista de Alunos a um Professor.
```java
public class Main {
  public static void main(String[] args) {
    Professores p1 = new Professores("Lara", "lara@gmail.com",true);
    Alunos a1 = new Alunos("Lara", null, "lara@gmail.com",4, null,true,p1);
    Alunos a2 = new Alunos("Diego", null, "diego@gmail.com",2, null,false,p1);

    ListaGenerica<Alunos> listaDeAlunas = new ListaGenerica<>();
    listaDeAlunas.adicionar(a1);
    listaDeAlunas.adicionar(a2); 
  }
}
public class Professores {
  public void adicionarAluno(ListaGenerica<Alunos> lista) {
    listaDeAlunos = new ListaGenerica<Alunos>();
    listaDeAlunos = lista;
  }
}
```
* Relação Aluno e Nota:
  * Cada Aluno pode ter uma quantidade infinita de notas, e elas precisam estar armazenadas.
  * As notas sao fundamentais para informar o status do aluno, Reprovado ou Aprovado.
```java
public class Main {
public static void main(String[] args) {
    Professores p1 = new Professores("Lara", "lara@gmail.com",true);
    Alunos a1 = new Alunos("Lara", null, "lara@gmail.com",4, null,true,p1);
    ListaGenerica<Notas> notasLara = new ListaGenerica<>();

    Notas nota1 = new Notas(2,3);
    Notas nota2 = new Notas(2,2);
    notasLara.adicionar(nota1);
    notasLara.adicionar(nota2);

    System.out.println("ALUNO 1 INFORMAÇÕES COMPLETASS:" + "\n" + aluno1.situacaoAluno());
    System.out.println("MÉDIA: " + aluno1.media());
    }
}
public class Alunos {
public void adicionarNotas(ListaGenerica<Notas> listaDeNotas) throws QuantidadeException{
    if(listaDeNotas.size()>getQuantidade()) {
        throw new QuantidadeException("Quantidade de notas maior que a quantidade desejada");
    }
    if(listaDeNotas.size()<getQuantidade()) {
        throw new QuantidadeException("Quantidade de notas menor que a quantidade desejada");
    }
    contadorNota(listaDeNotas.size());
    notas = listaDeNotas;	
}
public String situacaoAluno(){
    return "\n" + this.matricula + " - " + tratamento()  + this.nome + "\n" + "(" + this.email + ")" 
    +"\n" +"QUANTIDADE TOTAL DE AVALIÇOES: " + this.contadorNota +"\n" 
    + "MEDIA DO ALUNO: " + media() + "\n" 
    + "SITUAÇAO DO ALUNO: " + aprovacao() + "\n";
}

```
### Status do Projeto
Concluído.
  
