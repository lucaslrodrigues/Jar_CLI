/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.projeto.individual.java.jar;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Você precisa realizar login para utilizar o serviço\n"
                + "Informe o login e senha\n\nLogin:");
        String loginRecebido = leitor.nextLine();
        System.out.println("Senha:");
        String senhaRecebido = leitor.nextLine();
        
        Login loginClasse = new Login(loginRecebido, senhaRecebido);
    }
}
