package site.gaeddocoding.deliveryproject.food;

import lombok.*;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Food {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(length = 300, nullable = false)
    private String foodName; // 이름

    @Column(nullable = false)
    private Integer foodPrice;// 가격

    private String foodSize; // 사이즈

}
