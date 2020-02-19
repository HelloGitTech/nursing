package servicetest;

import com.xjx.nursing.NursingApp;
import com.xjx.nursing.mapper.CaregiverMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = NursingApp.class)
@RunWith(SpringRunner.class)
public class CaregiverDaoTest {
    @Autowired
    private CaregiverMapper caregiverMapper;

    @Test
    public void testGetListBySysuserId(){
        System.out.println("---------------------------");
        System.out.println("CaregiverList："+ caregiverMapper.getListBySysuserId(Long.parseLong("1")));
        System.out.println("---------------------------");

    }
}
