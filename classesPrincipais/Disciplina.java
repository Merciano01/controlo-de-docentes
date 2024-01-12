public class Disciplina {
    int codigo;
    int carga_horaria;
    String nome;
    Professor professor;
    Curso curso;

    public Disciplina(int cod, String nome, int cargaHoraria){
        this.codigo = cod;
        this.nome = nome;
        this.carga_horaria = cargaHoraria;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo= " + codigo +
                ", carga_horaria= " + carga_horaria + "h"+
                ", nome= '" + nome + '\'' +
                ", professor= " + professor.getNome() +
                ", curso= " + curso.getNome() +
                '}';
    }
}
