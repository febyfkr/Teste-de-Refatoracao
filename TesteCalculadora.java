package calculadora;

/**		
 * 		<p><strong>Teste da calculadora</strong></p>
 * 		<p>Esta classe irá testar a anterior, cada uma das operações:</p>
 * 		<p>Soma: '+'</p>
 * 		<p>Subtração: '-'</p>
 * 		<p>Multiplicação: '*'</p>
 * 		<p>Divisão: '/'</p>
 * 		<p>Vale ressaltar o processo de refatoração que estamos aprendendo.</p>
 * 
 * @author Frederico K. Reis
 * @version 1.0
 */

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        /**
         *    Os resultados esperados são respectivamente 5, 6, 15, 4, erro e operador inválido
         */
        System.out.println(calc.calcular(2, 3, "+"));  
        System.out.println(calc.calcular(10, 4, "-")); 
        System.out.println(calc.calcular(3, 5, "*"));  
        System.out.println(calc.calcular(8, 2, "/"));  
        
        try {
            System.out.println(calc.calcular(8, 0, "/")); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}