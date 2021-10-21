import java.util.Scanner;


public class CalculadoraSalario {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o salário bruto: ");
        double salario = ler.nextDouble();
        System.out.println(calcularSalarioLiquido(salario));
    }

    public static long calcularSalarioLiquido(double salarioBase) {
        double salarioSemInss = calcularInss(salarioBase);
        double salarioSemIrrf = calcularIrrf(salarioSemInss);
        if(salarioSemInss < 1039)
            return Math.round(0.0);

        return Math.round(salarioSemIrrf);
    }

    private static double calcularIrrf(double salario) {
        if(salario <= 3000 )
            return salario;
        else if(salario > 6000)
            return salario - (salario * 0.15);
        else
            return salario - (salario * 0.075);
    }

    private static double calcularInss(double salarioBase) {
        if(salarioBase <= 1500)
            return salarioBase - (salarioBase * 0.08);
        else if(salarioBase > 1500 && salarioBase <= 4000)
            return salarioBase - (salarioBase * 0.09);
        else
            return salarioBase - (salarioBase * 0.11);
    }
}