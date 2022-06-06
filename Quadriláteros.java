/** A sobrecarga é quando um método é reutilizado com o mesmo nome, mas com a lista de parâmetros diferentes
 * ------------------------------EXERCÍCIO--------------------------
 * Crie uma aplicação que calcula a área dos três quadriláteros notáveis: quadrado, retângulo e trápezio,
 * usando sobrecarga.
 */

public class Quadriláteros{

    public static void area(double lado){
        double area = lado*lado;
        System.out.println("A área do quadrado é de " + area + "m²");
    }

    public static void area(double base, double altura){
        double area = base*altura;
        System.out.println("A área do retângulo é de " + area + "m²");
    }

    public static void area(double baseMenor, double baseMaior, double altura){
        double area = (baseMaior+baseMenor)*altura/ 2;
        System.out.println("A área do trapézio é de " + area + "m²");
    }

}
