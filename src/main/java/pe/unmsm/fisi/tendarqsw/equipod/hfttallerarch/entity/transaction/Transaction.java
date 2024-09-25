package pe.unmsm.fisi.tendarqsw.equipod.hfttallerarch.entity.transaction;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Transaction {
    private Long id;
    private String codeStockCompany;
    private String type;
    private Long quantity;
    private BigDecimal price;
}
