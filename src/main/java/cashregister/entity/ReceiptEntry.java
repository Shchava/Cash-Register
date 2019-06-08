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
    @ManyToOne
    @JoinColumn(name = "id_receipt",referencedColumnName = "id_goods")
    Goods goods;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_goods",referencedColumnName = "id_receipt")
    Receipt receipt;

    @Column(name = "count")
    int count;

    @Column(name = "weight")
    int weight;

    @Column(name = "price")
    int price;
}
