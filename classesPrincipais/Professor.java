public class Professor extends Funcionario {
    public String titulacao;
    public String areaPesquisa;

    @Override
    public String toString() {
        //todo -> rever o metodo para apresentar a infomacoes essenciais
        final StringBuffer sb = new StringBuffer("Professor{");
        sb.append("nome= '").append(getNome()).append('\'');
        sb.append(", titulacao= '").append(titulacao).append('\'');
        sb.append(", areaPesquisa= '").append(areaPesquisa).append('\'');
        sb.append(", endereco= '").append(getEndereco()).append('\'');
        sb.append(", telefone= '").append(getTelefone()).append('\'');
        sb.append(", salario= ").append(getSalario()).append(" AOA");
        sb.append('}');
        return sb.toString();
    }
}
