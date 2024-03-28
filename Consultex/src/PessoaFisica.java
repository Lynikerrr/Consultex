public class PessoaFisica {

    private final String nome;
    private final String cpf;
    private final String dataNascimento;
    Contato contato;
    Endereco endereco;

    public PessoaFisica(String nome, String cpf, String dataNascimento, String email, String telefone, String cep, String logradouro, String complemento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.contato = new Contato();
        this.contato.setEmail(email);
        this.contato.setTelefone(telefone);
        this.endereco = new Endereco();
        this.endereco.setCep(cep);
        this.endereco.setLogradouro(logradouro);
        this.endereco.setComplemento(complemento);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void mostraDados(){
        System.out.println("##########################");
        System.out.println("##### Os dados da PF #####");
        System.out.println("#### selecionada são: ####");
        System.out.println("##########################");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Telefone: " + contato.getTelefone());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("Endereço: " + endereco.getLogradouro());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("##########################");
    }
}
