package pe.unmsm.fisi.tendarqsw.equipod.hfttallerarch.infrastructure.adapters.persitence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.unmsm.fisi.tendarqsw.equipod.hfttallerarch.infrastructure.adapters.persitence.schema.TransactionSchema;

public interface TransactionJpaRepository extends JpaRepository<TransactionSchema, Long> {
}
