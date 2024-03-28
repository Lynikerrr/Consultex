import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        PessoaFisica anaLuisa = new PessoaFisica("Ana Luisa Lima de Souza", "267.252.550-19", "13/05/2000", "analuisalds@icloud.com", "(16)956456132", "69550-210", "Rua 11", "Bloco 28 Ap 303");
        PessoaFisica lynikerSantos = new PessoaFisica("Lyniker Vinicius Santos de Oliveira", "087.296.800-69", "03/01/2000", "lynikersantos00@gmail.com", "(16)981507408", "06070-240", "Rua 0", "Proximo ao correio");
        PessoaFisica patriciaOliveira = new PessoaFisica("Patricia Aparecida Santos de Oliveira", "686.149.260-49", "11/12/1971", "patylyniker@hotmail.com", "(16)997577055", "59074-830", "Avenida Brasil", "Atras do " + "Shopping");
        PessoaJuridica lets = new PessoaJuridica("45.779.747/0001-28", "Let's Rent A Car", "lets@gmail.com", "(16)" + "9879845645", "69006-412", "Rua Shangri-lá", "Atrás da escola");
        PessoaJuridica start = new PessoaJuridica("62.015.578/0001-79", "Start Electronics", "start.ele@outlook.com", "(18)8794564651", "85045-590", "Rua Nelson Rocha Marcondes", "N/A");
        PessoaJuridica mrv = new PessoaJuridica("64.070.045/0001-15", "MRV & CO", "mrvco@icloud.com", "(16)33337224", "49069-249", "Rua I", "Piso 7");
        mensagemInicial();
        escolhaTipo(lets,start,mrv,lynikerSantos,anaLuisa,patriciaOliveira);


    }
    public static void mensagemInicial(){
        System.out.println();
        System.out.println();
        System.out.println("##########################");
        System.out.println("####### Consultex ########");
        System.out.println("#### Made By: Lyniker ####");
        System.out.println("##########################");
        System.out.println();
        System.out.println();
    }

    public static void escolhaTipo(PessoaJuridica lets, PessoaJuridica start, PessoaJuridica mrv,
                                   PessoaFisica lynikerSantos, PessoaFisica anaLuisa, PessoaFisica patriciaOliveira){
        Scanner entrada = new Scanner(System.in);
        System.out.println("##########################");
        System.out.println("###### O que deseja ######");
        System.out.println("####### Consultar? #######");
        System.out.println("##########################");
        System.out.println("#### 1- Pessoa Fisica ####");
        System.out.println("#### 2- Pessoa Juridica ##");
        System.out.println("##########################");
        System.out.println();
        System.out.println();
        int tipoPessoa = entrada.nextInt();

        switch (tipoPessoa){
            case 1:
                System.out.println("##########################");
                System.out.println("#### Escolha entre as ####");
                System.out.println("## pessoas cadastradas: ##");
                System.out.println("##########################");
                System.out.println("1 - " + anaLuisa.getNome());
                System.out.println("2 - " + lynikerSantos.getNome());
                System.out.println("3 - " + patriciaOliveira.getNome());
                System.out.println("##########################");
                int escolhaPF = entrada.nextInt();
                switch (escolhaPF){
                    case 1:
                        anaLuisa.mostraDados();
                        break;

                    case 2:
                        lynikerSantos.mostraDados();
                        break;
                    case 3:
                        patriciaOliveira.mostraDados();
                        break;
                    default:
                        System.out.println("Seleção inválida");
                }
                break;
            case 2:
                System.out.println("##########################");
                System.out.println("#### Escolha entre as ####");
                System.out.println("## empresas cadastradas ##");
                System.out.println("##########################");
                System.out.println("1 - " + lets.getRazaoSocial());
                System.out.println("2 - " + start.getRazaoSocial());
                System.out.println("3 - " + mrv.getRazaoSocial());
                System.out.println("##########################");
                int tipoPJ = entrada.nextInt();
                switch (tipoPJ){
                    case 1:
                        lets.mostraDadosPJ();
                        break;
                    case 2:
                        start.mostraDadosPJ();
                        break;
                    case 3:
                        mrv.mostraDadosPJ();
                        break;
                    default:
                        System.out.println("Seleção inválida");
                }

        }
    }
}