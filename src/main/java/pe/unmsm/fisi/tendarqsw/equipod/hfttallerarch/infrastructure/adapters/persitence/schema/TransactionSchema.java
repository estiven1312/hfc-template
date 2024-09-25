package pe.unmsm.fisi.tendarqsw.equipod.hfttallerarch.infrastructure.adapters.persitence.schema;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "tbl_transaction")
@Data
public class TransactionSchema {
    @Id
    private Long id;
    private String codeStockCompany;
    private String type;
    private Long quantity;
    private BigDecimal price;
}
