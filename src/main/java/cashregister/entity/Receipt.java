package cashregister.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "receipt")
public class Receipt {
    @Id
    long id_receipt;

    @Column(name = "created")
    LocalDateTime created;

    @Column(name = "cassier")
    User cashier;

    @Column(name = "senior_cassier")
    User seniorCashier;
}
