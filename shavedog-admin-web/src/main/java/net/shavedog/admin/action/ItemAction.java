package net.shavedog.admin.action;

import net.shavedog.api.service.ItemService;
import net.shavedog.api.util.PageUtils;
import net.shavedog.api.vo.ItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * http://localhost:8002/boot/admin/test?abc=dsajdhasjkdhkas
 */
@RestController
public class ItemAction {
    @Autowired
    private ItemService itemService;
    @GetMapping("/boot/admin/add")
    public boolean add(@RequestBody ItemVo itemVo){
        System.out.println(itemVo);
        System.out.println(this.itemService.createItem(itemVo));
        return this.itemService.createItem(itemVo);
    }
    @GetMapping("/api/admin/items/list")
    public Object showTest(int page,int size){
        Map<String,Object> map = new HashMap<>();
        Map<String, Object> list = this.itemService.list(page,size);
        try {
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
    @PutMapping("/api/admin/items/status")
    public void upStatus(Long id,String status){
        System.out.println(id+"：：：：：：：：："+status);
        this.itemService.uploadStatus(id,status);
    }
}
