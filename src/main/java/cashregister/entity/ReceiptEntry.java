package cashregister.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "receipt_entry")
public class ReceiptEntry {
    @Id
    @Column(name = "id_goods")
    @ManyToOne
    Goods goods;

    @Id
    @Column(name = "id_receipt")
    @ManyToOne
    Receipt receipt;

    @Column(name = "count")
    int count;

    @Column(name = "weight")
    int weight;

    @Column(name = "price")
    int price;
}
