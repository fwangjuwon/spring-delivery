package site.gaeddocoding.deliveryproject.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private Integer id;

    private String username; // 이름

    private String userHp;// 폰번호

    private String address; // 주소지

    public User toEntity() {
        return User.builder()
                .id(this.id)
                .username(this.username)
                .userHp(this.userHp)
                .address(this.address)
                .build();
    }
}
