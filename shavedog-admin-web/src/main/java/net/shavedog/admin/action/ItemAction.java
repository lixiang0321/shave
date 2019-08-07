package net.shavedog.admin.action;

import net.shavedog.api.service.ItemService;
import net.shavedog.api.vo.ItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * http://localhost:8002/boot/admin/test?abc=dsajdhasjkdhkas
 */
@RestController
public class ItemAction {
    @Autowired
    private ItemService itemService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/boot/admin/add")
    public boolean add(@RequestBody ItemVo itemVo){
        System.out.println(itemVo);
        System.out.println(this.itemService.createItem(itemVo));
        return this.itemService.createItem(itemVo);
    }

    @GetMapping("/boot/admin/test")
    public String showTest(String str){
        return this.itemService.test(str);
    }
    @GetMapping("/boot/admin/list")
    public Object showTest(){
        return this.itemService.list();
    }
}
