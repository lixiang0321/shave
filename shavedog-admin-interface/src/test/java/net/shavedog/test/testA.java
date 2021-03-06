package net.shavedog.test;

import net.shavedog.admin.StartAdminInterface8001;
import net.shavedog.admin.dao.ItemDao;
import net.shavedog.api.service.ItemService;
import net.shavedog.api.util.PageUtils;
import net.shavedog.api.vo.ItemVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration    // 表示需要启动Web配置才可以进行测试
@SpringBootTest(classes = StartAdminInterface8001.class)  // 定义要测试的启动类
public class testA {
    @Autowired
    private ItemService itemService;
    @Autowired
    private ItemDao itemDao;
    @Test
    public void testList(){
        PageUtils pageUtils = new PageUtils();
        pageUtils.setPage(0);
        pageUtils.setSize(1);
//        System.out.println(this.itemService.uploadStatus(1L,"OBTAINED"));
        System.out.println(this.itemService.list(0,1));
    }

}
