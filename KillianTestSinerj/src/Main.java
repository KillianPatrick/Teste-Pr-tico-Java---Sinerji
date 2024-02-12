import entidades.Cargo;
import entidades.Funcionario;
import entidades.Vendas;
import service.FuncionarioService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Main {


    public static void main(String[] args) {


        FuncionarioService funcionarioService = new FuncionarioService();

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
//        int mes;
//        int ano;
//        Scanner sc1 = new Scanner(System.in);
//
//        mes = sc1.nextInt();
//        ano = sc1.nextInt();

        funcionarios.add(new Funcionario("Jorge Carvalho", 0L, LocalDate.of(2018, 01, 01)));
        funcionarios.add(new Funcionario("Maria Souza", 0L, LocalDate.of(2015, 12, 01)));
        funcionarios.add(new Funcionario("Ana Silva", 1L, LocalDate.of(2021, 12, 01)));
        funcionarios.add(new Funcionario("João Mendes", 1L, LocalDate.of(2021, 12, 01)));
        funcionarios.add(new Funcionario("Juliana Alves", 2L, LocalDate.of(2017, 07, 01)));
        funcionarios.add(new Funcionario("Bento Albino", 2L, LocalDate.of(2014, 03, 01)));

        List<Funcionario> vendedores = new ArrayList<Funcionario>();

        vendedores.add(new Funcionario("Ana Silva", 1L, LocalDate.of(2021, 12, 01)));
        vendedores.add(new Funcionario("João Mendes", 1L, LocalDate.of(2021, 12, 01)));


//        Long SOMA = funcionarioService.valorTotalSalarioBeneficio(funcionarios);
//
//        Funcionario vendedorDeMariorVenda= funcionarioService.funcionarioMaiorVenda(vendedores, mes, ano);


    }

}

