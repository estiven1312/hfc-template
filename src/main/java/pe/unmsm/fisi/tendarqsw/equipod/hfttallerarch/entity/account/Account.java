package pe.unmsm.fisi.tendarqsw.equipod.hfttallerarch.entity.account;

import lombok.Data;
import pe.unmsm.fisi.tendarqsw.equipod.hfttallerarch.entity.user.User;

import java.math.BigDecimal;

@Data
public class Account {
    private Long id;
    private String code;
    private User user;
    private String type;
    private BigDecimal balance;
}
