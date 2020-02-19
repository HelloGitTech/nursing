package servicetest;

import com.xjx.nursing.NursingApp;
import com.xjx.nursing.enumeration.OrderStatusEnum;
import com.xjx.nursing.mapper.NursingOrderMapper;
import com.xjx.nursing.pojo.NursingOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = NursingApp.class)
@RunWith(SpringRunner.class)
public class OrderDaoTest {
    @Autowired
    private NursingOrderMapper orderMapper;

    @Test
    public void testInsertOrder(){
/*        System.out.println("---------------------------");
        Long id = 0L;
        NursingOrder order = new NursingOrder();
        order.setOrderCode("45656745764563563");
        order.setServiceName("生活照护");
        order.setOrderAmount(4500L);
        order.setSysuserId(1L);
        order.setCreateTime(new Date());
        order.setOrderStatus(OrderStatusEnum.getEnumById(1));
        order.setPaidAmount(0L);
        orderMapper.insertNursingOrder(order);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("订单创建时间："+sdf.format(order.getCreateTime()));
        System.out.println("NursingOrder:"+order);
        System.out.println("---------------------------");*/
        List<NursingOrder> orderlist = orderMapper.listNursringOrder(1L);
        for(NursingOrder order : orderlist){
            System.out.println(order);
        }
    }
}
