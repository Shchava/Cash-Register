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
    @Column(name = "id_receipt")
    long id_receipt;

    @Column(name = "created")
    LocalDateTime created;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cashier", referencedColumnName = "id_user")
    User cashier;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "senior_cashier", referencedColumnName = "id_user")
    User seniorCashier;
}
