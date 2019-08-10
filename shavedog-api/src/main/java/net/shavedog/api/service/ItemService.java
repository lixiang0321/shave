package net.shavedog.api.service;

import net.shavedog.api.config.FeignClientConfig;
import net.shavedog.api.util.PageUtils;
import net.shavedog.api.vo.ItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 *@FeignClient(value = "SHAVEDOG-ZUUL-GATEWAY",configuration = FeignClientConfig.class,
 *         fallbackFactory = DeptServiceFallbackFactory.class)
 *
 * 如果你需要进行服务的降级，可以更换注解
 */
@FeignClient(value = "SHAVEDOG-ZUUL-GATEWAY",configuration = FeignClientConfig.class)
public interface ItemService {
    /**
     * 商品增加
     * @param itemVo
     * @return
     */
    @GetMapping("/happy-proxy/admin-cloud/admin/add")
    public boolean createItem(ItemVo itemVo);
    @GetMapping("/happy-proxy/admin-cloud/admin/test/{str}")
    public String test(@PathVariable("str") String str);

    /**
     * 显示商品列表
     * @return
     */
    @ResponseBody
    @GetMapping("/happy-proxy/admin-cloud/api/admin/items/list")
    public Map<String,Object> list(@RequestParam("page") int page,@RequestParam("size") int size);

    /**
     * 更改商品状态
     * @param id
     * @return
     */
    @PutMapping("/happy-proxy/admin-cloud/api/admin/items/status/{id}")
    public int uploadStatus(@PathVariable("id") Long id,@RequestParam(value = "status") String status);

}
