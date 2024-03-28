## Consultex - Sistema de Consulta de Pessoas

Este é um programa Java desenvolvido para demonstrar um sistema de consulta de pessoas físicas e jurídicas. Ele permite que o usuário visualize informações detalhadas sobre as pessoas cadastradas, incluindo nome, CPF/CNPJ, dados de contato e endereço.

### Funcionalidades

- Consulta de pessoas físicas e jurídicas.
- Visualização detalhada das informações de cada pessoa cadastrada.

### Requisitos

- JDK (Java Development Kit) instalado em seu sistema.
- Um ambiente de desenvolvimento Java, como Eclipse, IntelliJ IDEA ou qualquer outro de sua preferência.

### Como usar

1. Clone este repositório em sua máquina local:

```bash
git clone https://github.com/seuusuario/consultex.git
```

2. Navegue até o diretório do projeto:

```bash
cd consultex
```

3. Compile os arquivos Java:

```bash
javac Main.java
```

4. Execute o programa:

```bash
java Main
```

5. Siga as instruções fornecidas pelo programa para consultar as pessoas cadastradas.

### Estrutura do Projeto

O projeto é estruturado da seguinte forma:

- **Main.java**: Arquivo principal do programa contendo a lógica principal.
- **Pessoa.java**: Classe base para representar uma pessoa, contendo informações comuns a pessoas físicas e jurídicas.
- **PessoaFisica.java**: Classe que representa uma pessoa física, estendendo a classe Pessoa.
- **PessoaJuridica.java**: Classe que representa uma pessoa jurídica, estendendo a classe Pessoa.
- **Contato.java**: Classe que representa os dados de contato de uma pessoa.
- **Endereco.java**: Classe que representa o endereço de uma pessoa.

### Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema no código ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

### Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter mais detalhes.

---

Esse ReadME fornece uma visão geral do projeto Consultex, incluindo instruções de uso, estrutura do projeto e informações sobre contribuição e licenciamento. Sinta-se à vontade para personalizá-lo de acordo com suas necessidades.
