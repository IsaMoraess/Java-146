package atvd47;
/*      EXERCÍCIO-02
Fazer um programa para ler os dados de um funcionario(nome, selario bruto e imposto).
Em seguida, aumentar o salario do funcionario com base em uma porcentagem dado
(somente o salario bruto é afetado pela porcentagem) e mostrar novamente os dados
do funcionario, use a classe abaixo:
        funcionario
-----------------------------------------------
nome: string
salario: double
imposto: double
-----------------------------------------------
+ SalarioLiquido(): double
+ AumentarSalario(porcentagem : double): void
-----------------------------------------------*/

public class funcionario {
    public String nome;
    public double salario;
    public double imposto;

    public double SalarioLiquido(){
        return salario;
    }

    public void AumentarSalario(double porcentagem){
        return salario + porcentagem;
    }
}



