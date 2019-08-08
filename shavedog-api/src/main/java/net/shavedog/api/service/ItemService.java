package net.shavedog.api.service;

import net.shavedog.api.config.FeignClientConfig;
import net.shavedog.api.fallback.DeptServiceFallbackFactory;
import net.shavedog.api.vo.ItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
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

    @GetMapping("/happy-proxy/admin-cloud/api/admin/items")
    public Map<String,Object> list();
}
