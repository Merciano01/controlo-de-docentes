import classesPrincipais.Curso;
import java.util.ArrayList;

public class ListaCurso {
    ArrayList<Curso> cursos = new ArrayList<>();
    
    public void addCurso(Curso curso){
        cursos.add(curso);
    }
    
    public String listarCursos(){
        for (Curso curso: cursos
             ) {
            return curso.getNome();
        }

        return null;
    }

    public void dadosDoCurso(Curso curso){
        curso.toString();
    }

    public void deleteCurso(Curso curso){
        cursos.remove(curso);
    }
}