package tn.adminproject.mainwebapplication.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Table(name = "Shared_Menu", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = {"TYPE", "PARENT_ID", "MENU_ORDER"}, name = "UNIQUE_ASL_ORDER")
},

indexes = {
@Index(name = "SHARED_MENU_R01", columnList = "PARENT_ID")
})
public class SharedMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TYPE")
    private Integer type;

    @Column(name = "ACTIVE")
    private Integer active;

    @Column(name = "EN_NAME")
    private String enName;

    @Column(name = "AR_NAME")
    private String arName;

    @Column(name = "EN_DESC")
    private String enDesc;

    @Column(name = "AR_DESC")
    private String arDesc;

    @Column(name = "FR_NAME")
    private String frName;

    @Column(name = "FR_DESC")
    private String frDesc;

    @Column(name = "ICON_COLOR")
    private String iconColor;

    @Column(name = "TEXT_COLOR")
    private String textColor;

    @Column(name = "LOGO")
    private String logo;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private SharedMenu parentMenu;


    @Column(name = "MENU_ORDER")
    private Integer menuOrder;

    @Column(name = "LIB_REFERANCE")
    private String libReference;

    @Column(name = "ONLINE_HELP")
    private String onlineHelp;

    @Column(name = "PATH_NAME")
    private String pathName;





    // Constructors
    public SharedMenu(Integer type, Integer active, String enName, String arName, String enDesc,
                      String arDesc, String frName, String frDesc, String iconColor, String textColor,
                      String logo, SharedMenu parentMenu, Integer menuOrder, String libReference,
                      String onlineHelp, String pathName) {
        this.type = type;
        this.active = active;
        this.enName = enName;
        this.arName = arName;
        this.enDesc = enDesc;
        this.arDesc = arDesc;
        this.frName = frName;
        this.frDesc = frDesc;
        this.iconColor = iconColor;
        this.textColor = textColor;
        this.logo = logo;
        this.parentMenu = parentMenu;
        this.menuOrder = menuOrder;
        this.libReference = libReference;
        this.onlineHelp = onlineHelp;
        this.pathName = pathName;
    }


    @OneToMany(mappedBy = "parentMenu", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<SharedMenu> children;




}
