public class PessoaJuridica {
    private String cnpj;
    private String razaoSocial;
    Contato contato;
    Endereco endereco;

    public PessoaJuridica(String cnpj, String razaoSocial, String email, String telefone, String cep, String logradouro, String complemento) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.contato = new Contato();
        this.contato.setEmail(email);
        this.contato.setTelefone(telefone);
        this.endereco = new Endereco();
        this.endereco.setCep(cep);
        this.endereco.setLogradouro(logradouro);
        this.endereco.setComplemento(complemento);


    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void mostraDadosPJ(){
        System.out.println("##########################");
        System.out.println("###### Os dados da #######");
        System.out.println("##### empresas são: ######");
        System.out.println("##########################");
        System.out.println("Nome: " + razaoSocial);
        System.out.println("CPF: " + cnpj);
        System.out.println("Telefone: " + contato.getTelefone());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("Endereço: " + endereco.getLogradouro());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("##########################");
    }

}
