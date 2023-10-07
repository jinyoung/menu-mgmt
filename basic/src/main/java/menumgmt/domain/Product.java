package menumgmt.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import menumgmt.BasicApplication;
import menumgmt.domain.ProductRegistered;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        ProductRegistered productRegistered = new ProductRegistered(this);
        productRegistered.publishAfterCommit();
    }

    public static ProductRepository repository() {
        ProductRepository productRepository = BasicApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }
}
//>>> DDD / Aggregate Root
