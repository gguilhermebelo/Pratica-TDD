package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recipefy recipefy = new Recipefy();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar receita");
            System.out.println("2. Buscar receita por ID");
            System.out.println("3. Remover receita");
            System.out.println("4. Listar receitas");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da receita: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a descrição da receita: ");
                    String descricao = scanner.nextLine();
                    System.out.println(recipefy.adicionarReceita(nome, descricao));
                    break;
                case 2:
                    System.out.print("Digite o ID da receita a ser buscada: ");
                    int id = scanner.nextInt();
                    System.out.println(recipefy.buscarReceita(id));
                    break;
                case 3:
                    System.out.print("Digite o ID da receita que deseja remover: ");
                    int idRemover = scanner.nextInt();
                    System.out.println(recipefy.removerReceita(idRemover));
                    break;
                case 4:
                    System.out.print("Receitas disponiveis:");
                    for (String receita : recipefy.listarReceitas()) {
                        System.out.println("- " + receita);
                    }
                    break;
                case 5:
                    System.out.println("Já vai? fique mais um pouco na Recipefy");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
