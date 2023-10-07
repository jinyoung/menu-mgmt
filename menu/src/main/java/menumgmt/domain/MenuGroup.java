package menumgmt.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import menumgmt.MenuApplication;

@Entity
@Table(name = "MenuGroup_table")
@Data
//<<< DDD / Aggregate Root
public class MenuGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private MenuGroupId parentId;

    private String name;

    private String group;

    private Integer sequence;

    private Boolean isActive;

    private String type;

    private String selectedImage;

    private String deselectImage;

    public static MenuGroupRepository repository() {
        MenuGroupRepository menuGroupRepository = MenuApplication.applicationContext.getBean(
            MenuGroupRepository.class
        );
        return menuGroupRepository;
    }
}
//>>> DDD / Aggregate Root
