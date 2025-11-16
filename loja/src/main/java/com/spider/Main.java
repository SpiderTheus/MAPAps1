package com.spider;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = -1;

        System.out.println("*___ Controle de produtos ___*");

        do {
            try {
                System.out.println("*___ MENU ___*");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Listar produtos");  
                System.out.println("3 - Buscar produto por categoria");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opcao: ");
                opcao = sc.nextInt();
                sc.nextLine(); 


            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    produtos.stream().forEach(System.out::println);
                    break;
                case 3:
                    listarPorCategoria();
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("Opcao invalida. Tente novamente.");
                    }
                    break;
            
            }
            } catch (Exception e) {
                System.out.println("Entrada invalida. Tente novamente.");
                sc.nextLine();
                continue;
            }

        } while (opcao != 0); 
        System.out.println("tem certo que deseja sair? (S/N)");
        String confirma = sc.nextLine();
        
        if (confirma.equalsIgnoreCase("S")) {
            System.out.println("Programa encerrado.");
            sc.close();
        } else {
            main(args); 
        }
    
    }

    public static void cadastrarProduto() {
        while (true) {
            try {
            System.out.print("Nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Preco do produto: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade em estoque: ");
            int qtdEstoque = sc.nextInt();
            sc.nextLine();

            System.out.print("Categoria do produto: ");
            String categoria = sc.nextLine();

            Produto produto = new Produto(nome, preco, qtdEstoque, categoria);
            produtos.add(produto);
            System.out.println("Produto cadastrado com sucesso!");
            break;
            
        }
             catch (Exception e) {
                System.out.println("Entrada invalida. Tente novamente.");
                sc.nextLine();
            }
           
    }
    }

    public static void listarPorCategoria() {
        while (true) {
            try {
                System.out.print("Digite a categoria: ");
                String categoria = sc.nextLine();

                List<Produto> produtosFiltrados = produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria)).toList();

                produtosFiltrados.forEach(System.out::println);
                break;
            } catch (Exception e) {
                System.out.println("Entrada invalida. Tente novamente.");
                sc.nextLine();
            }
            break;

        }
    }
}