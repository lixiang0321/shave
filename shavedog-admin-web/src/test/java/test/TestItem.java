package test;

import net.shavedog.admin.StartAdminService8002;
import net.shavedog.api.service.ItemService;
import net.shavedog.api.vo.ItemVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration    // 表示需要启动Web配置才可以进行测试
@SpringBootTest(classes = StartAdminService8002.class)  // 定义要测试的启动类
public class TestItem {
    @Autowired
    private ItemService itemService;
    @Autowired
    private RestTemplate restTemplate;
    @Test
    public void testSave(){
        ItemVo itemVo = new ItemVo();
        itemVo.setName("abcdsad");

        this.itemService.createItem(itemVo);
    }
}
