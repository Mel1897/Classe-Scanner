/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificadorprimo;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class VerificadorPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            boolean primo = true;
            if (numero <= 1) {
                primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }

            System.out.print("Deseja verificar outro número? (s/n): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));

        sc.close();
    }
}
