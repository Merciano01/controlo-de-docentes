abstract class Funcionario {
    private String nome;
    private String endereco;
    private String telefone;
    private double salario;

    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void calculaGanho(){
        //Calcula o ganho anual do funcionario
        System.out.println("Ganho anual: "+getSalario()*12);
    }
    public void bonifica(int percentagem){
        float percentagem_ = (float) percentagem /100;
        this.salario *= percentagem_;
    }

}
