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
public class Funcionario {

    @Getter
    String nome;

    Long cargo;

    LocalDate contratacaoData;


}
