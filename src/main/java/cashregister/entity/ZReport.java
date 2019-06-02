package cashregister.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Z")
public class ZReport extends XReport {
}
