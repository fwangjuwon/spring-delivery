package site.gaeddocoding.deliveryproject.orders;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class OrdersController {

    private final OrdersService ordersService;

    // 주문 생성 (post)
    public String insertOrders() {
        ordersService.doInsertOrders();
        return "";
    }

    // 주문 변경 (put)
    public String updateOrders() {
        ordersService.doUpateOrders();
        return "";
    }

    // 주문 취소 (delete)
    public String cancelOrders() {
        ordersService.doCancelOrders();
        return "";
    }

    // 주문 조회 (get)
    public String searchOrders() {
        ordersService.doSearchOrders();
        return "";
    }

}
