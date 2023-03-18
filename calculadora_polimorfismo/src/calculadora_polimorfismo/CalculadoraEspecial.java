
package calculadora_polimorfismo;

import java.util.Scanner;

public class CalculadoraEspecial implements InterfazCalculadora {
    @Override
    public int sumarEnteros(int numero1, int numero2) {
        return (numero1 + numero2) / 2;
    }
    @Override
    public int restarEnteros(int numero1, int numero2) {
        return (numero1 - numero2) / 2;
    }
    @Override
    public int multiplicarEnteros(int numero1, int numero2) {
        return (numero1 * numero2) / 2;
    }
    @Override
    public int dividirEnteros(int numero1, int numero2) {
        return (numero1 / numero2) / 2;
    }
    @Override
    public double calcularRaizCuadrada(int numero1) {
        return Math.sqrt(numero1) / 2;
    }
    
    public int capturaNumero (){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int num = sc.nextInt();
        return num;
    }
}