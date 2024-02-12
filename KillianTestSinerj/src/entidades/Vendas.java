package entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Builder
public class Vendas {

    @Getter
    Long  vendedor;

    Long  valor;

    LocalDate dataVenda;



//    ● Um método que receba uma lista de vendedores, mês e ano e retorne o que mais
//    vendeu no mês


}
