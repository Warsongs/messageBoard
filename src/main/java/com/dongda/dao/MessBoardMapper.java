package com.dongda.dao;

import com.dongda.entity.MessBoard;
import com.dongda.entity.MessBoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessBoardMapper {
    int countByExample(MessBoardExample example);

    int deleteByExample(MessBoardExample example);

    int deleteByPrimaryKey(Integer msbdId);

    int insert(MessBoard record);

    int insertSelective(MessBoard record);

    List<MessBoard> selectByExample(MessBoardExample example);

    List<MessBoard> queryAllMessBoard();

    MessBoard selectByPrimaryKey(Integer msbdId);

    int updateByExampleSelective(@Param("record") MessBoard record, @Param("example") MessBoardExample example);

    int updateByExample(@Param("record") MessBoard record, @Param("example") MessBoardExample example);

    int updateByPrimaryKeySelective(MessBoard record);

    int updateByPrimaryKey(MessBoard record);
}