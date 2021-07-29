import java.util.Scanner;


public class Trab {
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int opcao=1;
		
		String nome[] = new String[50];	
		String endereco[]= new String[50];
		String celular[] = new String[50];
		
		String nomeBusca;
		String prodBusca;
		
		String nomeCadas;
		String nomeCadasProd;
		
		String nomeProd[] = new String[50];
		String descricao[] = new String[50];
		float compra[] = new float[50];
		float lucro[] = new float[50];
		int estoque[] = new int[50];
		int vendas;
		int numClientes, numProd;
		int fimVetorClientes = 0;
		int fimVetorProdutos = 0;
		int contador = 0;
		
		while (opcao!=7) {
			System.out.print("1 - CADASTRAR CLIENTE\n");
			System.out.print("2 - BUSCAR CLIENTE\n");
			System.out.print("3 - CADASTRAR PRODUTO\n");
			System.out.print("4 - BUSCAR PRODUTO\n");
			System.out.print("5 - CADASTRAR VENDA\n");
			System.out.print("6 - MOSTRAR ESTOQUE\n");
			System.out.print("7 - SAIR\n");
			
			System.out.print("\nESCOLHA UMA OPÇÃO\n");
			opcao = ler.nextInt();
			
		if (opcao ==1) {
			System.out.print("Quantos clientes serão cadastrados?\n");
			numClientes = ler.nextInt();
			clearBuffer(ler);
			System.out.print("CADASTRE TUDO EM MINÚSCULO\n");
			
			while (contador<numClientes) {
				System.out.print("Nome do " + (contador+1) + "º cliente: ");
				nome[fimVetorClientes] = ler.nextLine();
				System.out.print("Endereço do " + (contador+1) + "º cliente: \n");
				endereco[fimVetorClientes] = ler.nextLine();
				System.out.print("Celular do " + (contador+1) + "º cliente: \n");
				celular[fimVetorClientes] = ler.nextLine();
				contador++;
				fimVetorClientes++;
			}
			contador = 0;
			
		}else if (opcao ==2) {
			clearBuffer(ler);
			System.out.print("Nome do cliente a ser buscado:\nDIGITE EM MINUSCULO");
			nomeBusca =ler.nextLine();
			int altDados;
			int validador = 0;
			
			while (contador<fimVetorClientes) {
				
				if (nomeBusca.intern() == nome[contador].intern()) {
					
					validador = 1;
					System.out.print("	CLIENTE ENCONTRADO\n");
					System.out.print("Nome do cliente: " + nome[contador] + "\n");
					System.out.print("Endereço do cliente: " + endereco[contador] + "\n");
					System.out.print("Celular do cliente: " + celular[contador] + "\n");
					System.out.print("Deseja alterar os dados do cliente?\n");
					System.out.print("[1 = SIM / 2 = NÃO]\n");
					altDados = ler.nextInt();
					clearBuffer(ler);
					
					if (altDados == 1) {
						
						System.out.print("	CADASTRE SEMPRE EM MINUSCULO\nNome do cliente: \n");
						nome[contador] = ler.nextLine();
						System.out.print("Endereço do cliente: \n");
						endereco[contador] = ler.nextLine();
						System.out.print("Celular do cliente: \n");
						celular[contador] = ler.nextLine();
					}					
				}
				contador++;
			}
				if (validador == 0) {
					System.out.print("Cliente não encontrado!\n");
				}
			
			contador =0;
			
		}else if (opcao ==3) {
			System.out.print("Quantos produtos serão cadastrados?\n");
			numProd = ler.nextInt();
			System.out.print("CADASTRE TUDO EM MINÚSCULO\n");

			while (contador<numProd) {
				clearBuffer(ler);
				System.out.print("Nome do " + (contador+1) + "º produto: ");
				nomeProd[fimVetorProdutos] = ler.nextLine();
				System.out.print("Descrição do " + (contador+1) + "º produto: \n");
				descricao[fimVetorProdutos] = ler.nextLine();
				System.out.print("Valor de compra do " + (contador+1) + "º produto: \n");
				compra[fimVetorProdutos] = ler.nextFloat();
				System.out.print("Porcentagem de lucro do " + (contador+1) + "º produto: \n");
				lucro[fimVetorProdutos] = ler.nextFloat();
				System.out.print("Quantidade em estoque do " + (contador+1) + "º produto: \n");
				estoque[fimVetorProdutos] = ler.nextInt();
				contador++;
				fimVetorProdutos++;
			}
			contador = 0;
			
		}else if (opcao ==4) {
			clearBuffer(ler);
			System.out.print("Nome do produto a ser buscado:\nDIGITE EM MINUSCULO\n");
			prodBusca =ler.nextLine();
			int altDados;
			int validador = 0;
			contador = 0;
			while (contador<fimVetorProdutos) {

				if (prodBusca.intern() == nomeProd[contador].intern()) {
					
					validador = 1;
					System.out.print("	PRODUTO ENCONTRADO\n");
					System.out.print("Nome do produto: " + nomeProd[contador] + "\n");
					System.out.print("Descrição do produto: " + descricao[contador] + "\n");
					System.out.print("Valor do produto: R$" + compra[contador] + "\n");
					System.out.print("Porcentagem de lucro do produto: " + lucro[contador] + "%\n");
					System.out.print("Quantidade em estoque do produto: " + estoque[contador] + "\n");
					System.out.print("Deseja alterar os dados do produto?\n");
					System.out.print("[1 = SIM / 2 = NÃO]\n");
					altDados = ler.nextInt();
					clearBuffer(ler);
					
					if (altDados == 1) {

						System.out.print("	CADASTRE SEMPRE EM MINUSCO\n");
						System.out.print("Nome do produto: ");
						nomeProd[contador] = ler.nextLine();
						System.out.print("Descrição do produto: \n");
						descricao[contador] = ler.nextLine();
						System.out.print("Valor de compra do produto: \n");
						compra[contador] = ler.nextFloat();
						System.out.print("Porcentagem de lucro do produto: \n");
						lucro[contador] = ler.nextFloat();
						System.out.print("Quantidade em estoque do produto: \n");
						estoque[contador] = ler.nextInt();
					}					
				}
				contador++;
			}
				if (validador == 0) {
					System.out.print("Produto não encontrado!\n");
				}
			
			contador =0;
			
		}else if (opcao ==5) {
			clearBuffer(ler);
			int vetorCadastro = 0;
			int validador = 1;
			
			System.out.print("	LISTA DE CLIENTES\n");
			while (contador<fimVetorClientes) {
				System.out.print(nome[contador]+"\n");
				contador++;
			}
			System.out.print("Digite o nome para ser cadastrado\n");
			nomeCadas = ler.nextLine();
			
			contador = 0;
			
			while (validador==1) {
				System.out.print("	LISTA DE PRODUTOS\n");
				while (contador<fimVetorProdutos) {
					System.out.print(nomeProd[contador]+"\n");
					contador++;
				}
				System.out.print("Digite o produto para serem cadastradas as vendas\n");
				nomeCadasProd = ler.nextLine();

				
				contador =0;
				
				while (contador<fimVetorProdutos) {
					if (nomeCadasProd.intern() == nomeProd[contador].intern()) {
						vetorCadastro = contador;
					}
				contador++;
				}
				
				System.out.print("Quantos produtos foram vendidos?\n");
				vendas = ler.nextInt();
				if ((estoque[vetorCadastro] - vendas) < 0) {
					System.out.print("Vendas maior que o estoque disponível");
				}else {
					estoque[vetorCadastro] -= vendas;
				}
				System.out.print("Deseja cadastrar mais uma venda? \n");
				System.out.print("As vendas de " + nomeCadasProd + " foram cadastradas com sucesso para o cliente: " + nomeCadas +"\n");
				System.out.print("[1 - SIM / 2 - NÃO\n");
				validador= ler.nextInt();
				clearBuffer(ler);
				contador=0;
			}
		}else if (opcao ==6) {
			contador=0;
			
			System.out.print("	LISTA DE ESTOQUE\n");
			while (contador<fimVetorProdutos) {
				System.out.print(nomeProd[contador] + " - " + estoque[contador] + "\n");
				contador++;
			}
			contador=0;
		}else if (opcao ==7) {
			System.out.print("SAINDO...\n");

		}else {
			System.out.print("Opção inválida\n\n");
		}
		}
		
	}

}
