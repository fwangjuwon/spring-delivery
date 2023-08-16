package site.gaeddocoding.deliveryproject.food;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class FoodService {

    //Dependency Injection
    private final FoodRepository foodRepository;

    //음식전체조회
    public String searchAllFood(){
    return "";
    }

    //음식단일조회
    public String serachSingleFood(){
        return "";
    }

    //음식등록
    @Transactional
    public String registerFood(){
        return "";
    }

    //음식수정
    @Transactional
    public String editFood(){
        return "";
    }

    //음식전체삭제
    @Transactional

    public String deleteAllFood(){
        return "";
    }

    //음식개별삭제
    @Transactional
    public String deleteSingleFood(){
        return "";
    }
}
