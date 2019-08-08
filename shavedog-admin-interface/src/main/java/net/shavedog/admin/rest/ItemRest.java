package net.shavedog.admin.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import net.shavedog.api.service.ItemService;
import net.shavedog.api.vo.ItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *  @HystrixCommand //服务监控  启动服务监控  如果需要在@GetMapping  上面
 * 加入注解进行监控
 */
@RestController
public class ItemRest {
    @Autowired
    private ItemService itemService ;

    @ApiOperation(value = "商品增加",notes = "一系列商品信息数据")
    @ApiImplicitParams({@ApiImplicitParam(name = "dto", value = "新部门数据的实体", required = true,dataTypeClass = ItemVo.class)})
    @HystrixCommand
    @GetMapping("/admin/add")
    public Object add(@RequestBody ItemVo itemVo) {
        System.out.println(itemVo);
        return this.itemService.createItem(itemVo);
    }
    @ApiOperation(value = "测试接口",notes = "测试数据")
    @ApiImplicitParams({@ApiImplicitParam(name = "dto", value = "测试数据", required = true,dataTypeClass = String.class)})
    @GetMapping("/admin/test")
    public String test(String abc){
        return this.itemService.test(abc);
    }

    @HystrixCommand
    @GetMapping("/api/admin/items")
    public Map<String,Object> list(){
        return this.itemService.list();
    }
}
