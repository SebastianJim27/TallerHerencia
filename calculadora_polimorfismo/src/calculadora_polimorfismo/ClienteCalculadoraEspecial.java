
package calculadora_polimorfismo;

public class ClienteCalculadoraEspecial {
    public static void main(String[] args) {
        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        int num1 = calculadora.capturaNumero();
        int num2 = calculadora.capturaNumero();
        System.out.println("Suma: " + calculadora.sumarEnteros(num1,num2));
        System.out.println("Resta: " + calculadora.restarEnteros(num1,num2));
        System.out.println("Multiplicacion: " + calculadora.multiplicarEnteros(num1,num2));
        System.out.println("Division: " + calculadora.dividirEnteros(num1,num2));
        System.out.println("Raiz cuadrada numero 1: " + calculadora.calcularRaizCuadrada(num1));
        System.out.println("Raiz cuadrada numero 2: " + calculadora.calcularRaizCuadrada(num2));
    }
}
