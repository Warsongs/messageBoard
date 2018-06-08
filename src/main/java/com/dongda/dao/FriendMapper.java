package com.dongda.dao;

import com.dongda.entity.FriendExample;
import com.dongda.entity.FriendKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendMapper {
    int countByExample(FriendExample example);

    int deleteByExample(FriendExample example);

    int deleteByPrimaryKey(FriendKey key);

    int insert(FriendKey record);

    int insertSelective(FriendKey record);

    List<FriendKey> queryAllFriendByUserId(String useId);

    List<FriendKey> selectByExample(FriendExample example);

    int updateByExampleSelective(@Param("record") FriendKey record, @Param("example") FriendExample example);

    int updateByExample(@Param("record") FriendKey record, @Param("example") FriendExample example);
}