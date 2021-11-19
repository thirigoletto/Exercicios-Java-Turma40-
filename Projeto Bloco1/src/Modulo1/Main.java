package Modulo1;
/** 
 * Classe responsavel pelo menu.
 * @version 2.2
 */
import java.util.Scanner;

public class Main{
    private static Scanner input = new Scanner(System.in);

    private static GrupoCarros grupoCarros;
    private static GrupoPessoas grupoPessoas;
    private static GrupoContratos grupoContratos;

    private static Carro carro;
    private static Pessoa pessoa, pessoaF, pessoaJ;
    private static Contrato contrato;

    private static String tipo, modelo, placa, isArCondicionado, isTurbo, dataDevolucao;
    private static String nome, endereco, cpf, cargo, idFuncionario, idCliente;
    private static int telefone, capPessoas;
    private static double valorFinal;
    
    /** 
     * Metodo principal(main), responsavel pela interacao com o usuario.
     *  @param args - parametros recebidos durante a chamada da aplicacao.
     */
    public static void main(String[] args) {
        grupoCarros = new GrupoCarros();
        grupoPessoas = new GrupoPessoas();
        grupoContratos = new GrupoContratos();
        
        int opcao1 = 0;
        
        System.out.println("\nBem vindo ao Sistema de Aluguel de Carros.");
        
        do{
            opcao1 = opcoesMenu();
        }while(opcao1 != 4); 
    }

    /**
     * Metodo que exibe um primeiro menu para o usuario
     * Serao dadas opcoes de 1 a 4 para o usuario escolher
     * @return int - opcao do menu escolhida pelo usuario
     */
    private static int menuPrincipal(){
        System.out.println("\nMenu principal");
        System.out.println("Escolha uma opcao: ");
        System.out.println("1- Pessoas");
        System.out.println("2- Carros");
        System.out.println("3- Contratos");
        System.out.println("4- Sair");
        //Le a opcao escolhida pelo usuario
        int opcao1 = input.nextInt();
        input.nextLine();
        //Retorna opcao escolhida
        return opcao1;
    }
    
    /**
     * Metodo que exibe o menu pessoa para o usuario.
     * @param entidade String - opcao escolhida, pessoa.
     * @return int - opcao do menu escolhida.
     */
    private static int menuPessoa(String entidade){
        System.out.println("\nMenu "+entidade);
        System.out.println("1-Cadastrar cliente");
        System.out.println("2-Cadastrar funcionario");
        System.out.println("3-Remover");
        System.out.println("4-Listar");
        System.out.println("5-Voltar");
        //Le a opcao escolhida pelo usuario
        int opcao2 = input.nextInt();
        input.nextLine();
        //Retorna opcao escolhida
        return opcao2;
    }
    
    /**
     * Metodo que exibe o menu carros para o usuario.
     * @param entidade String - opcao escolhida, carros.
     * @return int - opcao do menu escolhida.
     */
    private static int menuCarros(String entidade){
        System.out.println("\nMenu "+entidade);
        System.out.println("1-Cadastrar linha familia");
        System.out.println("2-Cadastrar linha popular");
        System.out.println("3-Cadastrar linha premium");
        System.out.println("4-Remover");
        System.out.println("5-Listar");
        System.out.println("6-Voltar");
        //Le a opcao escolhida pelo usuario
        int opcao2 = input.nextInt();
        input.nextLine();
        //Retorna opcao escolhida
        return opcao2;
    }

    /**
     * Metodo que exibe o menu contratos para o usuario.
     * @param entidade String - opcao escolhida, contratos.
     * @return int - opcao do menu escolhida.
     */
    private static int menuContratos(String entidade){
        System.out.println("\nMenu "+entidade);
        System.out.println("1-Cadastrar");
        System.out.println("2-Listar");
        System.out.println("3-Voltar");
        //Le a opcao escolhida pelo usuario
        int opcao2 = input.nextInt();
        input.nextLine();
        //Retorna opcao escolhida
        return opcao2;
    }
    
    /**
     * Metodo principal chamado na execucao do programa.
     */
    private static int opcoesMenu(){
        int opcao1 = 0;
        int opcao2 = 0;

        opcao1 = menuPrincipal();
        switch (opcao1){
            case 1:
                do{
                    opcao2 = menuPessoa("pessoa");
                    switch (opcao2){
                        case 1:
                            cadastrarCliente();
                        break;
                        case 2:
                            cadastrarFuncionario();
                        break;
                        case 3:
                            removerPessoa();
                        break;
                        case 4:
                            grupoPessoas.listarPessoas();
                        break;
                        case 5:
                            //Case para não cair em opção inválida quando digitar para voltar
                        break;
                        default:
                            System.out.println("\nOpcao invalida!");
                        break;
                    }
                }while(opcao2 != 5);
                return 2;
            case 2:
                do{
                    opcao2 = menuCarros("carro");
                    switch (opcao2){
                        case 1:
                            cadastrarCarroFamilia();
                        break;
                        case 2:
                             cadastrarCarroPop();
                        break;
                        case 3:
                            cadastrarCarroPremium();
                        break;
                        case 4:
                            removerCarro();
                        break;
                        case 5:
                            grupoCarros.listarCarros();
                        break;
                        case 6:
                            //Case para não cair em opção inválida quando digitar para voltar
                        break;
                        default:
                            System.out.println("\nOpcao invalida!");
                        break;
                    }
                }while(opcao2 != 6);
                return 2;
            case 3:
                do{
                    opcao2 = menuContratos("contrato");
                    switch (opcao2){
                        case 1:
                            cadastrarContrato();
                        break;
                        case 2:
                            grupoContratos.listarContratos();
                        break;
                        case 3:
                            //Case para não cair em opção inválida quando digitar para sair
                        break;
                        default:
                            System.out.println("\nOpcao invalida!");
                        break;
                    }
                }while(opcao2 != 3);
                return 2;
            case 4:
                return 4; //Case para não cair em opção inválida quando digitar para sair
            default:
                System.out.println("\nOpcao invalida!");
                return 2;
        }
    }
    
    /**
     * Metodo para cadastro de carro da linha familia.
     * O metodo faz chamada ao metodo addCarro, presente na classe GrupoCarros.
     */
    private static void cadastrarCarroFamilia(){
        System.out.println("\nEntre com os dados pedidos: ");
        System.out.print("Modelo: ");
        modelo = input.nextLine();
        System.out.print("Placa: ");
        placa = input.nextLine();
        System.out.print("Capacidade de pessoas: ");
        capPessoas = input.nextInt();
        carro = new LinhaFamilia(modelo, placa, capPessoas);
        grupoCarros.addCarro(carro);
    }

    /**
     * Metodo para cadastro de carro da linha popular.
     * O metodo faz chamada ao metodo addCarro, presente na classe GrupoCarros.
     */
    private static void cadastrarCarroPop(){
        System.out.println("\nEntre com os dados pedidos: ");
        System.out.print("Modelo: ");
        modelo = input.nextLine();
        System.out.print("Placa: ");
        placa = input.nextLine();
        System.out.print("Possui ar condicionado: ");
        isArCondicionado = input.nextLine();
        carro = new LinhaPop(modelo, placa, isArCondicionado);
        grupoCarros.addCarro(carro);
    }
    
    /**
     * Metodo para cadastro de carro da linha premium.
     * O metodo faz chamada ao metodo addCarro, presente na classe GrupoCarros.
     */
    private static void cadastrarCarroPremium(){
        System.out.println("\nEntre com os dados pedidos: ");
        System.out.print("Modelo: ");
        modelo = input.nextLine();
        System.out.print("Placa: ");
        placa = input.nextLine();
        System.out.print("E turbo: ");
        isTurbo = input.nextLine();
        carro = new LinhaPremium(modelo, placa, isTurbo);
        grupoCarros.addCarro(carro);
    }
    
    /**
     * Metodo que remove um carro.
     * O metodo faz chamada ao metodo removerCarro, presente na classe GrupoCarros.
     */
    private static void removerCarro() {
        System.out.print("\nEntre com a placa do carro: ");
        placa = input.nextLine();
        if(grupoCarros.removerCarro(placa)) {
            System.out.print("Remocao realizada com sucesso.");
            System.out.println();
        } else {
            System.out.print("Erro: Carro inexistente.");
            System.out.println();
        }
    }

    /**
     * Metodo para cadastro de cliente.
     * O metodo faz chamada ao metodo addPessoa, presente na classe GrupoPessoas.
     */
    private static void cadastrarCliente(){
        System.out.println("\nEntre com os dados pedidos:");
        System.out.print("Nome: ");
        nome = input.nextLine();
        System.out.print("Endereco: ");
        endereco = input.nextLine();
        System.out.print("CPF: ");
        cpf = input.nextLine();
        System.out.print("Tipo: ");
        tipo = input.nextLine();
        System.out.print("Telefone: ");
        telefone = input.nextInt();
        pessoa = new Cliente(nome, endereco, cpf, telefone, tipo);
        grupoPessoas.addPessoa(pessoa);
    }

    /**
     * Metodo para cadastro de funcionario.
     * O metodo faz chamada ao metodo addPessoa, presente na classe GrupoPessoas.
     */
    private static void cadastrarFuncionario(){
        System.out.println("\nEntre com os dados pedidos: ");
        System.out.print("Nome: ");
        nome = input.nextLine();
        System.out.print("Endereco: ");
        endereco = input.nextLine();
        System.out.print("CPF: ");
        cpf = input.nextLine();
        System.out.print("Cargo: ");
        cargo = input.nextLine();
        System.out.print("Telefone: ");
        telefone = input.nextInt();
        pessoa = new Funcionario(nome, endereco, cpf, telefone, cargo);
        grupoPessoas.addPessoa(pessoa);
    }
    
    /**
     * Metodo que remove uma pessoa.
     * O metodo faz chamada ao metodo removerPessoa, presente na classe GrupoPessoas.
     */
    private static void removerPessoa() {
        System.out.print("\nEntre com o CPF: ");
        cpf = input.nextLine(); 
        if(grupoPessoas.removerPessoa(cpf)) {
            System.out.print("Remocao realizada com sucesso.");
            System.out.println();
        } else {
            System.out.print("Erro: Pessoa inexistente.");
            System.out.println();
        }
    }

    /**
     * Metodo para cadastro de contratos.
     * O metodo faz chamada ao metodo addcontrato, presente na classe GrupoContratos
     * Faz a verificacao dos resultados que o metodo pode retornar, e exibe uma mensagem ao usuario.
     */
    private static void cadastrarContrato(){
        System.out.println("\nEntre com os dados pedidos: ");
        System.out.print("Identificacao do funcionario: ");
        idFuncionario = input.nextLine();
        pessoaF = grupoPessoas.buscarPessoa(idFuncionario);
        if (pessoaF == null){
            System.out.println("Erro: Funcionario inexistente.");
            return;
        }
        System.out.print("Placa do carro: ");
        placa = input.nextLine();
        carro = grupoCarros.buscarCarro(placa);
        if (carro == null){
            System.out.println("Erro: Carro inexistente.");
            return;
        }
        System.out.print("Identificacao do cliente: ");
        idCliente = input.nextLine();
        pessoaC = grupoPessoas.buscarPessoa(idCliente);
        if (pessoaC == null){
            System.out.println("Erro: Cliente inexistente.");
            return;
        }
        System.out.print("Data da entrega do veiculo: ");
        dataDevolucao = input.nextLine();
        System.out.print("Valor da locacao: ");
        valorFinal = input.nextDouble();
        contrato = new Contrato(carro, pessoaC, pessoaF, dataDevolucao, valorFinal);
        grupoContratos.addContrato(contrato);
    }
}