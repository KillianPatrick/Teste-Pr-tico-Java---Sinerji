package service;

import entidades.Cargo;
import entidades.Funcionario;
import entidades.Vendas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {


//    ● Um método que receba uma lista de funcionários, mês e ano e retorne o valor total
//    pago (salário e benefício) a esses funcionários no mês.
    public Long valorTotalSalarioBeneficio(List<Funcionario> funcionariosList){
        List<Cargo> cargos = new ArrayList<Cargo>();
        cargos.add(new Cargo("Secretario", 7000L, (long) 1.2, 1000L));
        cargos.add(new Cargo("Vendedor", 12000L, (long) 1.3, 1800L));
        cargos.add(new Cargo("Gerente", 20000L, (long) 1.0, 3000L));
        int cargoAtual = -1;
        long salario = 0;
        long totalPagoFunc = 0;
        long somaTotal = 0;

        for(int i = 0; i <= funcionariosList.size(); i++){
            cargoAtual = funcionariosList.get(i).getCargo().intValue();
            salario = cargos.get(cargoAtual).getSalario()
                    + ( cargos.get(cargoAtual).getBonus()
                    * ( LocalDate.now().getYear() - funcionariosList.get(i).getContratacaoData().getYear()));
            totalPagoFunc = salario * cargos.get(cargoAtual).getBeneficio();
            somaTotal += totalPagoFunc;
        }

        return somaTotal;
    }


//    ● Um método que receba uma lista de funcionários, mês e ano e retorne o total pago
//    somente em salários no mês.
    public Long valorTotalSalario(List<Funcionario> funcionariosList){
        List<Cargo> cargos = new ArrayList<Cargo>();
        cargos.add(new Cargo("Secretario", 7000L, (long) 1.2, 1000L));
        cargos.add(new Cargo("Vendedor", 12000L, (long) 1.3, 1800L));
        cargos.add(new Cargo("Gerente", 20000L, (long) 1.0, 3000L));
        int cargoAtual = -1;
        long salario = 0;
        long totalPagoFunc = 0;
        long somaTotal = 0;

        for(int i = 0; i <= funcionariosList.size(); i++){
            cargoAtual = funcionariosList.get(i).getCargo().intValue();
            salario = cargos.get(cargoAtual).getSalario()
                    + ( cargos.get(cargoAtual).getBonus()
                    * ( LocalDate.now().getYear() - funcionariosList.get(i).getContratacaoData().getYear()));
            totalPagoFunc = salario;
            somaTotal += totalPagoFunc;
        }

        return somaTotal;
    }


//    ● Um método que receba uma lista somente com os funcionários que recebem
//    benefícios, mês e ano e retorne o total pago em benefícios no mês.
    public Long valorBeneficios(List<Funcionario> funcionariosList){
        List<Cargo> cargos = new ArrayList<Cargo>();
        cargos.add(new Cargo("Secretario", 7000L, (long) 1.2, 1000L));
        cargos.add(new Cargo("Vendedor", 12000L, (long) 1.3, 1800L));
        cargos.add(new Cargo("Gerente", 20000L, (long) 1.0, 3000L));
        int cargoAtual = -1;
        long salario = 0;
        long totalPagoFunc = 0;
        long somaTotal = 0;

        for(int i = 0; i <= funcionariosList.size(); i++){
            cargoAtual = funcionariosList.get(i).getCargo().intValue();

            if (cargoAtual == 2){
                continue;
            }

            salario = cargos.get(cargoAtual).getSalario()
                    + ( cargos.get(cargoAtual).getBonus()
                    * ( LocalDate.now().getYear() - funcionariosList.get(i).getContratacaoData().getYear()));
            totalPagoFunc = salario * ( cargos.get(cargoAtual).getBeneficio() - 1);
            somaTotal += totalPagoFunc;
        }
        return somaTotal;
    }


//    ● Um método que receba uma lista de funcionários, mês e ano e retorne o que
//    recebeu o valor mais alto no mês.
    public Funcionario maiorValorRecebido(List<Funcionario> funcionariosList){
        List<Cargo> cargos = new ArrayList<Cargo>();
        cargos.add(new Cargo("Secretario", 7000L, (long) 1.2, 1000L));
        cargos.add(new Cargo("Vendedor", 12000L, (long) 1.3, 1800L));
        cargos.add(new Cargo("Gerente", 20000L, (long) 1.0, 3000L));
        int cargoAtual = -1;
        long salario = 0;
        long totalPagoFunc = 0;
        long maior = 0;
        int biggerIndex = 0;

        for(int i = 0; i <= funcionariosList.size(); i++){
            cargoAtual = funcionariosList.get(i).getCargo().intValue();
            salario = cargos.get(cargoAtual).getSalario()
                    + ( cargos.get(cargoAtual).getBonus()
                    * ( LocalDate.now().getYear() - funcionariosList.get(i).getContratacaoData().getYear()));
            totalPagoFunc = salario * (cargos.get(cargoAtual).getBeneficio());
            if (totalPagoFunc > maior){
                maior = totalPagoFunc;
                biggerIndex = i;
            }
        }

        return funcionariosList.get(biggerIndex);
    }


//    ● Um método que receba uma lista somente com os funcionários que recebem
//    benefícios, mês e ano e retorne o nome do funcionário que recebeu o valor mais
//    alto em benefícios no mês

    public String maiorValorRecebidoBeneficios(List<Funcionario> funcionariosList){
        List<Cargo> cargos = new ArrayList<Cargo>();
        cargos.add(new Cargo("Secretario", 7000L, (long) 1.2, 1000L));
        cargos.add(new Cargo("Vendedor", 12000L, (long) 1.3, 1800L));
        cargos.add(new Cargo("Gerente", 20000L, (long) 1.0, 3000L));
        int cargoAtual = -1;
        long salario = 0;
        long totalPagoFunc = 0;
        long maior = 0;
        int biggerIndex = 0;

        for(int i = 0; i <= funcionariosList.size(); i++){
            cargoAtual = funcionariosList.get(i).getCargo().intValue();
            salario = cargos.get(cargoAtual).getSalario()
                    + ( cargos.get(cargoAtual).getBonus()
                    * ( LocalDate.now().getYear() - funcionariosList.get(i).getContratacaoData().getYear()));
            totalPagoFunc = salario * ( cargos.get(cargoAtual).getBeneficio() - 1);
            if (totalPagoFunc > maior){
                maior = totalPagoFunc;
                biggerIndex = i;
            }
        }

        return funcionariosList.get(biggerIndex).getNome();
    }


//    ● Um método que receba uma lista de vendedores, mês e ano e retorne o que mais
//    vendeu no mês
    public Funcionario funcionarioMaiorVenda(List<Funcionario> venddores, int mes, int ano){
        List<Vendas> vendas = new ArrayList<Vendas>();

        vendas.add(new Vendas(2L, 5200L, LocalDate.of(2021, 12, 01)));
        vendas.add(new Vendas(2L, 4000L, LocalDate.of(2022, 01, 01)));
        vendas.add(new Vendas(2L, 4200L, LocalDate.of(2022, 02, 01)));
        vendas.add(new Vendas(2L, 5850L, LocalDate.of(2022, 03, 01)));
        vendas.add(new Vendas(2L, 7000L, LocalDate.of(2022, 04, 01)));

        vendas.add(new Vendas(3L, 3400L, LocalDate.of(2021, 12, 01)));
        vendas.add(new Vendas(3L, 7700L, LocalDate.of(2022, 01, 01)));
        vendas.add(new Vendas(3L, 5000L, LocalDate.of(2022, 02, 01)));
        vendas.add(new Vendas(3L, 5900L, LocalDate.of(2022, 03, 01)));
        vendas.add(new Vendas(3L, 6500L, LocalDate.of(2022, 04, 01)));


        long maior = 0;
        int biggerIndex = 0;

        for(int i = 0; i <= vendas.size(); i++){
            if( mes == vendas.get(i).getDataVenda().getMonth().getValue() && ano == vendas.get(i).getDataVenda().getYear()){
                if (vendas.get(i).getValor() > maior){
                    maior = vendas.get(i).getValor();
                    biggerIndex = i;
                }

            }
        }


        return venddores.get(biggerIndex);
    }
}

