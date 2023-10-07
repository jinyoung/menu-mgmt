package menumgmt.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import menumgmt.domain.*;
import menumgmt.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductRegistered extends AbstractEvent {

    private Long id;
    private String name;

    public ProductRegistered(Product aggregate) {
        super(aggregate);
    }

    public ProductRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
