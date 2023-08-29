package site.gaeddocoding.deliveryproject.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import site.gaeddocoding.deliveryproject.food.Food;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(unique = true, nullable = false)
    private String userName; // 이름

    @Column(length = 300, nullable = false)
    private String userHp;//폰번호

    @Column(nullable = false)
    private String address; //주소지

    @JoinColumn(name = "foodId")
    @ManyToOne(fetch = FetchType.EAGER) //food 1개가 user 여러개를 가짐
    private Food food;
}
