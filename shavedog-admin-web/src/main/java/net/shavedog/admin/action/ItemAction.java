package net.shavedog.admin.action;

import net.shavedog.api.service.ItemService;
import net.shavedog.api.vo.ItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @ResponseBody
    @GetMapping("/api/admin/items")
    public Object showTest(){
        Map<String,Object> map = new HashMap<>();
        Map<String, Object> list = this.itemService.list();
        try {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            map.put("code",200);
            map.put("msg","success");
            map.put("data",list);
        }catch (Exception e){
            e.printStackTrace();
            map.put("code",500);
            map.put("msg","error");
        }
        return map;
    }
}
