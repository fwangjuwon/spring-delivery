package site.gaeddocoding.deliveryproject.food;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Food {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(nullable = false)
    private String foodName; //이름

    @Column(nullable = false)
    private Integer foodPrice;//가격
    @Column(nullable = false)
    private String foodSize; //사이즈
    @Column(nullable = false)
    private boolean sideDish; //사이드디쉬여부

}
