package site.gaeddocoding.deliveryproject.user;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.gaeddocoding.deliveryproject.util.ResponseDto;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;
    private final HttpSession session;

    // 회원가입
    @PostMapping("/usersjoin")
    public ResponseEntity<?> join(@RequestBody User user) {
        if (user.getUsername() == null || user.getUserHp() == null || user.getAddress() == null) {
            return new ResponseEntity<>(new ResponseDto<>(-1, "실패!! 회원 정보는 필수 값 입니다!!(이름, 폰번호, 주소)", null),
                    HttpStatus.BAD_REQUEST);
        }
        userService.doJoin(user);
        return new ResponseEntity<>(new ResponseDto<>(1, "회원가입 성공!!", user), HttpStatus.OK);

    }

    // 로그인
    @PostMapping("/userslogin")
    public ResponseEntity<?> login(User user) {
        User userEntity = userService.doLogin(user);

        if (userEntity != null) {
            session.setAttribute("principal", userEntity);
            return new ResponseEntity<>(new ResponseDto<>(1, "로그인 성공!!", user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new ResponseDto<>(-1, "실패!! 로그인실패!", null),
                    HttpStatus.BAD_REQUEST);
        }
    }

    // 회원정보수정
    @PutMapping("/users/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody UserDto userDto) {

        if (userDto.getUsername() == null || userDto.getUserHp() == null || userDto.getAddress() == null) {
            return new ResponseEntity<>(new ResponseDto<>(-1, "실패!! 필수값이 없습니다!", null), HttpStatus.BAD_REQUEST);
        } else {
            userService.doUpdate(userDto, id);
            return new ResponseEntity<>(new ResponseDto<>(1, "성공!!", null), HttpStatus.OK);

        }
    }

    // 회원정보보기
    @GetMapping("/users/{id}")
    public User detail(@PathVariable Integer id) {
        return userService.doDetail(id);

    }

}
