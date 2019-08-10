package net.shavedog.admin.dao;


import net.shavedog.admin.po.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PropertyDao  extends JpaRepository<PropertyEntity,Long> {
}
