package cashregister.entity;

import lombok.*;

import javax.persistence.*;
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

    @ManyToOne
    User cashier;

    @ManyToOne
    User seniorCashier;
}
