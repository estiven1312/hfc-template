package pe.unmsm.fisi.tendarqsw.equipod.hfttallerarch.entity.prediction;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Data
public class Prediction {
    private Long id;
    private String nameAction;
    private BigInteger numberActions;
    private LocalDate datePrediction;
    private Boolean buyAction;
}
