package projeto;
  //Luan Nutels - Main Class 
  
  /** 
 * Classe responsavel pelo menu e algumas operacoes do sistema.
 * @version 1.2
 */

import java.util.Scanner;

public class Principal{
	private static Scanner input = new Scanner(System.in);
	private static Frota frota;
    private static Carro carro;
    private static ListaPessoas listapessoas;
    private static Pessoa pessoa;
    private static Alugueis alugueis;
    private static String tipo, modelo, cor, placa, isArCondicionado, isTurbo;
    private static String nome, endereco, email, cpf, ident, cargo, rg, id;
    private static int ano, telefone, escolha, capPessoas;
    private static double salario;
	
	public static void main(String[] args) {
		frota = new Frota();
        listaPessoas = new ListaPessoas();

		System.out.println("\nBem vindo ao Sistema de Aluguel de Carros.");
        int opcao1 = 0;
        int opcao2 = 0;
        do{
            opcao1 = menuPrincipal();
            switch (opcao1){
            	case 1:
                    do{
                    	opcao2 = menuPessoa("Pessoa");
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
                         		listaPessoas.listarPessoas();
                         	break;
                         	case 5:
                         		//Case para não cair em opção inválida quando digitar para voltar
                         	break;
                         	default:
                                System.out.println("\nOpcao invalida!");
                            break;
                        }
                    }while(opcao2 != 5);
                break;
                case 2:
                	do{
                		opcao2 = menuCarros("Carro");
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
                            	frota.listarCarros();
                            break;
                         	case 6:
                         		//Case para não cair em opção inválida quando digitar para voltar
                         	break;
                         	default:
                                System.out.println("\nOpcao invalida!");
                            break;
                        }
                	}while(opcao2 != 6);
                break;
                case 3:
                	do{
                        opcao2 = menuContratos("Contrato");
                        switch (opcao2){
                            case 1:
                                System.out.println("\nBem vindo ao Sistema de Aluguel de Carros.");
                            break;
                            case 2:
                                alugueis.listarContratos();
                            break;
                            case 3:
                                //Case para não cair em opção inválida quando digitar para sair
                            break;
                            default:
                                System.out.println("\nOpcao invalida!");
                            break;
                        }
                    }while(opcao2 != 3);
                break;
                case 4:
                    //Case para não cair em opção inválida quando digitar para sair
                break;
                default:
                    System.out.println("\nOpcao invalida!");
                break;
            }
        }while(opcao1 != 4); 
	}

	public static int menuPrincipal(){
		System.out.println("Escolha uma opcao: \n");
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

    private static void cadastrarCarroFamilia(){
        System.out.println("Entre com os dados pedidos.");
        System.out.println("Categoria: ");
        tipo = input.nextLine();
        System.out.println("Modelo: ");
        modelo = input.nextLine();
        System.out.println("Cor: ");
        cor = input.nextLine();
        System.out.println("Ano: ");
        ano = input.nextInt();
        System.out.println("Placa: ");
        placa = input.nextLine();
        System.out.println("Capacidade de pessoas: ");
        capPessoas = input.nextInt();
        System.out.println("Identificacao: ");
        id = input.nextLine();
        carro = new LinhaFamilia(tipo, modelo, cor, ano, placa, capPessoas, id);
        frota.addCarro(carro);
    }

    private static void cadastrarCarroPop(){
        System.out.println("Entre com os dados pedidos.");
        System.out.println("Categoria: ");
        tipo = input.nextLine();
        System.out.println("Modelo: ");
        modelo = input.nextLine();
        System.out.println("Cor: ");
        cor = input.nextLine();
        System.out.println("Ano: ");
        ano = input.nextInt();
        System.out.println("Placa: ");
        placa = input.nextLine();
        System.out.println("Possui ar condicionado: ");
        isArCondicionado = input.nextLine();
        System.out.println("Identificacao: ");
        id = input.nextLine();
        carro = new LinhaPop(tipo, modelo, cor, ano, placa, isArCondicionado, id);
        frota.addCarro(carro);
    }

    private static void cadastrarCarroPremium(){
        System.out.println("Entre com os dados pedidos.");
        System.out.println("Categoria: ");
        tipo = input.nextLine();
        System.out.println("Modelo: ");
        modelo = input.nextLine();
        System.out.println("Cor: ");
        cor = input.nextLine();
        System.out.println("Ano: ");
        ano = input.nextInt();
        System.out.println("Placa: ");
        placa = input.nextLine();
        System.out.println("E turbo: ");
        isTurbo = input.nextLine();
        System.out.println("Identificacao: ");
        id = input.nextLine();
        carro = new LinhaPremium(tipo, modelo, cor, ano, placa, isTurbo, id);
        frota.addCarro(carro);
    }

    private static void removerCarro(){
        System.out.println("Entre com 1 para remover um carro da linha familia, 2 para remover um carro da linha popular e 3 para remover um carro da linha premium.");
        escolha = input.nextInt();
        if(escolha == 1){
            System.out.println("Entre com a identificacao da linha familia: ");
        } else if (escolha == 2){
            System.out.println("Entre com a identificacao da linha popular: ");
        }else{
            System.out.println("Entre com a identificacao da linha premium: ");
        }
        id = input.nextLine();
        if(frota.removeCarro(escolha, id)){
            System.out.println("Remocao realizada com sucesso.");
        }else{
            System.out.println("Erro: Carro inexistente.");
        }
    }

    private static void cadastrarCliente(){
        System.out.println("Entre com os dados pedidos.");
        System.out.println("Nome: ");
        nome = input.nextLine();
        System.out.println("Endereco: ");
        endereco = input.nextLine();
        System.out.println("Email: ");
        email = input.nextLine();
        System.out.println("CPF: ");
        cpf = input.nextLine();
        System.out.println("Telefone: ");
        telefone = input.nextInt();
        System.out.println("Tipo: ");
        tipo = input.nextLine();
        System.out.println("Identificacao: ");
        ident = input.nextLine();
        pessoa = new Cliente(nome, endereco, email, cpf, telefone, tipo, ident);
        listapessoas.addPessoa(pessoa);
    }

    private static void cadastrarFuncionario(){
        System.out.println("Entre com os dados pedidos.");
        System.out.println("Nome: ");
        nome = input.nextLine();
        System.out.println("Endereco: ");
        endereco = input.nextLine();
        System.out.println("Email: ");
        email = input.nextLine();
        System.out.println("CPF: ");
        cpf = input.nextLine();
        System.out.println("Telefone: ");
        telefone = input.nextInt();
        System.out.println("Cargo: ");
        cargo = input.nextLine();
        System.out.println("Registro Geral: ");
        rg = input.nextLine();
        System.out.println("Salario: ");
        salario = input.nextDouble();
        pessoa = new Funcionario(nome, endereco, email, cpf, telefone, cargo, salario, rg);
        listapessoas.addPessoa(pessoa);
    }

    private static void removerPessoa(){
        System.out.println("Entre com 1 para remover um cliente e 2 para remover um funcionario.");
        escolha = input.nextInt();
        if(escolha == 1){
            System.out.println("Entre com a identificacao do cliente: ");
        } else{
            System.out.println("Entre com o registro geral do funcionario: ");
        }
        id = input.nextLine();
        if(frota.removeCarro(escolha, id)){
            System.out.println("Remocao realizada com sucesso.");
        }else{
            System.out.println("Erro: Pessoa inexistente.");
        }
    }

}


