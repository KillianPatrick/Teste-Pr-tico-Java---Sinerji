package entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Builder
public class Cargo {

    String nome;

    Long  salario;

    Long  beneficio;

    Long  bonus;

}
