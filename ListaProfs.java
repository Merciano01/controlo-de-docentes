public class ListaProfs {
    /*Esta classe tem o proposito de modelar uma lista para conter as instancias da classe Professor junto
    * os seus métodos*/

    ArrayList<Professor> list = new ArrayList<>();

    public void add(Professor prof){
        list.add(prof);
    }

    public String singularSearch(){
        for (Professor professor : list) {
            return professor.getNome();
        }
        return null;
    }

}
