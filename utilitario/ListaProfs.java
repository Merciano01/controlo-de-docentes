import classesPrincipais.Professor;

public class ListaProfs {
    /*Esta classe tem o proposito de modelar uma lista para conter as instancias da classe Professor junto
    * os seus métodos*/

    ArrayList<Professor> list = new ArrayList<>();

    public void add(Professor prof){
        list.add(prof);
    }

    public String singularSearch(Professor prof){
        if(list.contains(prof)){
            return prof.toString();
        }
        return null;
    }

    public void showAll(){
        for (Professor professor : list) {
            System.out.println(professor.toString());
        }
    }

    public void remove(Professor professor){
        list.remove(professor);
    }

}
