package cashregister.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.CHAR,
        name = "is_z_report")
@DiscriminatorValue("X")
public class XReport {
    @Id
    @Column(name = "id_x_report")
    long id_x_report;

    @Column(name = "shift_start")
    LocalDateTime shiftStart;

    @Column(name = "time")
    LocalDateTime time;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "receipt_entry",
            joinColumns = { @JoinColumn(name = "x_report_id_x_report") },
            inverseJoinColumns = { @JoinColumn(name = "receipt_id_receipt") }
    )
    Set<Receipt> receipts = new HashSet<>();
}
