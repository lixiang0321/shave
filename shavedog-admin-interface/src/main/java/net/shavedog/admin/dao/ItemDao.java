package net.shavedog.admin.dao;

import net.shavedog.admin.po.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface ItemDao extends JpaRepository<ItemEntity,Long> {
    @Modifying //表示更新
    @Query("UPDATE  ItemEntity SET status = ?2 WHERE id = ?1")
    public int doEditStatus(Long id,String status);
}
