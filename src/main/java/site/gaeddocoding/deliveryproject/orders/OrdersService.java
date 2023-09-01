package site.gaeddocoding.deliveryproject.orders;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    @Transactional
    public void doInsertOrders() {

    }

    @Transactional
    public void doUpateOrders() {

    }

    @Transactional
    public void doCancelOrders() {

    }

    public void doSearchOrders() {

    }

}
