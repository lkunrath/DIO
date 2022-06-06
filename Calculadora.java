/** Métodos devem ser criados dentro de classes e devem ser requisitados para serem executados.
* Padrão de definição: obs: o que estiver entre ?? é opcional!
* <?visibilidade?> <?tipo?> <?modificador?> retorno nome (<?parâmetros?>) <?exceções?> corpo
V = public, protected ou private
T = contreto ou abstrato
M = static ou final
R = tipo de dado ou void
N = nome que é fornecido ao método, deve ser descritivo, curto, notação camelo
P = parâmetros que pode receber
E = exceções que pode lançar
C = código que possui ou vazio
------------------------------------------------------- EXERCÍCIO -----------------------------------------------------
Crie uma aplicação que resolva as seguintes situações:
- Calcule as 4 operações básicas: soma, subtração, divisão e multiplicação. Sempre dois valores devem ser passados.
- A partir da hora do dia informe a mensagem adequada: bom dia, boa tarde ou boa noite.
*/ 
public class Calculadora{
    public static void soma(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("O resultado da soma de " + num1 + " e " + num2 + " é igual a " + resultado);
    }

    public static void subtração(double num1, double num2){
        double resultado = num1 - num2;
        System.out.println("O resultado da subtração de " + num1 + " e " + num2 + " é igual a " + resultado); 
    }

    public static void multiplicação(double num1, double num2){
        double resultado = num1*num2;
        System.out.println("O resultado da multiplicação de " + num1 + " e " + num2 + " é igual a " + resultado); 
    }

    public static void divisão(double num1, double num2){
        double resultado = num1/num2;
        System.out.println("O resultado da divisão de " + num1 + " e " + num2 + " é igual a " + resultado); 
    }
}