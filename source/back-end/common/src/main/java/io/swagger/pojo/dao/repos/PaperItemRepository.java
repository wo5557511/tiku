package io.swagger.pojo.dao.repos;

import io.swagger.pojo.dao.PaperItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 功能描述：试卷项实体Jpa操作类
 *
 * @作者：黄宽波
 * @时间:2019-07-09
 */
@Repository
public interface PaperItemRepository extends JpaRepository<PaperItem, Long>{

}