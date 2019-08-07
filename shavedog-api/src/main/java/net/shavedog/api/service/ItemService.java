package net.shavedog.api.service;

import net.shavedog.api.config.FeignClientConfig;
import net.shavedog.api.vo.ItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @GetMapping("/happy-proxy/admin-cloud/admin/list")
    public List<ItemVo> list();
}
