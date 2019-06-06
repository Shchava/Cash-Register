package cashregister.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
//
//@Entity
//@Table(name = "receipt_entry")
public class ReceiptEntry {
    @Id
    @ManyToOne
    Goods goods;

    @Id
    @ManyToOne
    Receipt receipt;

    @Column(name = "count")
    int count;

    @Column(name = "weight")
    int weight;

    @Column(name = "price")
    int price;
}
