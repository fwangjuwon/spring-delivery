package site.gaeddocoding.deliveryproject.user;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.gaeddocoding.deliveryproject.util.CustomException;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void doJoin(User user) {
        userRepository.save(user);
    }

    public User doLogin(User user) {
        return userRepository.mLogin(user.getUsername());
    }

    public User doDetail(Integer id) {
        return userRepository.findById(id).get();
    }

    @Transactional
    public void doUpdate(UserDto userDto, Integer id) {
        Optional<User> userOp = userRepository.findById(id);

        if (userOp.isPresent()) {
            User userEntity = userOp.get();
            userEntity.setUsername(userDto.getUsername());
            userEntity.setAddress(userDto.getAddress());
            userEntity.setUserHp(userDto.getUserHp());
        } else {
            throw new CustomException("id를 찾을 수 없습니다!!");
        }
    }
}
