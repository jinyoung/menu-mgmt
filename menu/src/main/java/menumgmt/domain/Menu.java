package menumgmt.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import menumgmt.MenuApplication;

@Entity
@Table(name = "Menu_table")
@Data
//<<< DDD / Aggregate Root
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private MenuGroupId parentId;

    private String name;

    private Integer sequence;

    private String pageName;

    private Boolean isActive;

    private String mode;

    private String root;

    private String type;

    public static MenuRepository repository() {
        MenuRepository menuRepository = MenuApplication.applicationContext.getBean(
            MenuRepository.class
        );
        return menuRepository;
    }
}
//>>> DDD / Aggregate Root
