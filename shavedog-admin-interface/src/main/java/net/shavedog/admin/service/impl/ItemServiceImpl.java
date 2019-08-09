package net.shavedog.admin.service.impl;

import net.shavedog.admin.dao.ItemDao;
import net.shavedog.admin.po.ItemEntity;
import net.shavedog.api.service.ItemService;
import net.shavedog.api.vo.ItemVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
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
    public Map<String,Object> list() {
        Map<String,Object> map = new HashMap<>();
        ItemVo  itemVo = new ItemVo();
        List<ItemVo> list =new ArrayList<>();
        List<ItemEntity> all = this.itemDao.findAll();
        Long count = this.itemDao.count();
        map.put("results",all);
//        all.forEach((item)->{
//            ItemVo dto = new ItemVo();
//            BeanUtils.copyProperties(item,dto);
//            list.add(dto);
//            map.put("results",list);
//        });
        map.put("total",count);
        return map;
    }
}
