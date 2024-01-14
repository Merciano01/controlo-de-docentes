/*Esta classe serve para os testes do sistema.*/
import classesPrincipais.Professor;
import classesPrincipais.Disciplina;
import classesPrincipais.Curso;
import utilitario.ListaProfs;
import utilitario.listaCursos;

public class Main{
    public static void main(String [] args){

        ListaProfs professores = new ListaProfs();
        ListaCursos cursos = new ListaCursos();

        Professor professor = new Professor();
        professor.setNome("Fernando Merciano");
        professor.setTelefone("925007828");
        professor.titulacao = "Licenciatura";
        professor.areaPesquisa = "Aprendizagem de Maquina";
        professor.setEndereco("Lobito-Rua Alto-Esperanca");
        professor.setSalario(360000);

        Professor professor2 = new Professor();
        professor2.setNome("Alberto Capingala");
        professor2.setTelefone("925007828");
        professor2.titulacao = "Doutor";
        professor2.areaPesquisa = "Redes Neurais";
        professor2.setEndereco("Benguela");
        professor2.setSalario(850000);

        Professor professor3 = new Professor();
        professor3.setNome("Jose Carlos");
        professor3.setTelefone("925007828");
        professor3.titulacao = "Mestre";
        professor3.areaPesquisa = "Bases de Dados";
        professor3.setEndereco("Lobito-Restinga");
        professor3.setSalario(550000);

        Curso curso = new Curso("Informática", 1, 4);
        Curso curso2 = new Curso("Recursos Humanos", 2, 4);
        Curso curso3 = new Curso("Gestão Empresarial", 3, 4);
        Curso curso4 = new Curso("Contabilidade", 4, 4);

        Disciplina disciplina = new Disciplina(1,"matemática",80);
        Disciplina disciplina2 = new Disciplina(2,"Programação",80);
        disciplina.setProfessor(professor);
        disciplina.setCurso(curso);
        disciplina2.setProfessor(professor2);
        disciplina2.setCurso(curso);
        System.out.println(curso);
        System.out.println(disciplina);
        System.out.println(disciplina2);

        professores.add(professor);
        professores.add(professor2);
        professores.add(professor3);

        cursos.addCurso(curso);
        cursos.addCurso(curso2);
        cursos.addCurso(curso3);
        cursos.addCurso(curso4);

        System.out.println(professores.singularSearch(professor));
        //listagem de professores
        professores.showAll();
        cursos.dadosDoCurso(curso2);
    }
}