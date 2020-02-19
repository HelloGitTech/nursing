package servicetest;

import com.xjx.nursing.NursingApp;
import com.xjx.nursing.enumeration.OrderStatusEnum;
import com.xjx.nursing.mapper.NursingOrderMapper;
import com.xjx.nursing.pojo.NursingOrder;
import com.xjx.nursing.service.NursingOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest(classes = NursingApp.class)
@RunWith(SpringRunner.class)
public class NursingOrderServiceTest {
    @Autowired
    private NursingOrderService nursingOrderService;

    @Test
    public void testInsertOrder(){
        System.out.println("---------------------------");
        NursingOrder order = new NursingOrder();
        order.setOrderCode("45656745764563563");
        order.setServiceName("生活照护");
        order.setOrderAmount(4500L);
        order.setSysuserId(1L);
        order.setCreateTime(new Date());
        order.setOrderStatus(OrderStatusEnum.getEnumById(0));
        order.setPaidAmount(0L);
        //nursingOrderService.insertNursingOrder(order);
        System.out.println("---------------------------");

    }
}
