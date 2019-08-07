package net.shavedog.admin.dao;

import net.shavedog.admin.po.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface ItemDao extends JpaRepository<ItemEntity,Long> {

}
