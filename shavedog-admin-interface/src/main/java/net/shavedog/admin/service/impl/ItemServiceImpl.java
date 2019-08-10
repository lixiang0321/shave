package net.shavedog.admin.service.impl;

import net.shavedog.admin.dao.ItemDao;
import net.shavedog.admin.dao.PropertyDao;
import net.shavedog.admin.po.ItemEntity;
import net.shavedog.api.service.ItemService;
import net.shavedog.api.util.PageUtils;
import net.shavedog.api.vo.ItemVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private PropertyDao propertyDao;
    @Override
    public boolean createItem(ItemVo itemVo) {
        ItemEntity itemEntity = new ItemEntity();
        BeanUtils.copyProperties(itemVo,itemEntity);
        return this.itemDao.save(itemEntity).getId() !=0;
    }

    @Override
    public String test(String str) {
        return str;
    }
    @Override
    public Map<String,Object> list(int page, int size) {
        Map<String,Object> map = new HashMap<>();
        //分页查询
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = PageRequest.of(page * size, size,sort);
        //分页数据查询
        Page<ItemEntity> all = this.itemDao.findAll(pageable);
        //分页数据
        List<ItemEntity> content = all.getContent();
        //总页数
        map.put("total",all.getTotalElements());
        //分页数据
        map.put("results",all.getContent());
        return map;
    }

    @Override
    public int uploadStatus(Long id,String status) {
        return this.itemDao.doEditStatus(id,status);
    }
}
