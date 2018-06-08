package com.dongda.dao;

import com.dongda.entity.Tag;
import com.dongda.entity.TagExample;
import com.dongda.entity.TagKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagMapper {
    int countByExample(TagExample example);

    int deleteByExample(TagExample example);

    int deleteByPrimaryKey(TagKey key);

    int insert(Tag record);

    int insertSelective(Tag record);

    List<Tag> selectByExampleWithBLOBs(TagExample example);

    List<Tag> selectByExample(TagExample example);

    List<Tag> selectByPrimaryKey(TagKey key);

    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    int updateByExampleWithBLOBs(@Param("record") Tag record, @Param("example") TagExample example);

    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKeyWithBLOBs(Tag record);

    int updateByPrimaryKey(Tag record);
}