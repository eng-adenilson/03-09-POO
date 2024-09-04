package estoque;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        estoque estoque = new estoque();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Mostrar estoque"); 
            System.out.println("3. Sair"); 
            int opcao = scanner.nextInt(); 
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do item: "); 
                    String nome = scanner.nextLine(); 
                    System.out.print("Preço: "); 
                    int preco = scanner.nextInt(); 
                    System.out.print("Quantidade: "); 
                    int quantidade = scanner.nextInt(); 
                    scanner.nextLine(); 

                    Item item = new Item(nome, preco, quantidade); 
                    estoque.adicionarItem(item); 
                    System.out.println("Item adicionado com sucesso!"); 
                    break;

                case 2:
                    estoque.mostrarEstoque(); 
                    break;

                case 3:
                    System.out.println("Saindo..."); 
                    scanner.close(); 
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente."); 
                    break;
            }
        }
    }
}
