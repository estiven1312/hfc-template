package pe.unmsm.fisi.tendarqsw.equipod.hfttallerarch.infrastructure.adapters.persitence.schema;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_prediction")
@Data
public class PredictionSchema {
    @Id
    private Long id;
}
