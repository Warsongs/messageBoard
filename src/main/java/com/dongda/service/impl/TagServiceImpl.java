package com.dongda.service.impl;

import com.dongda.dao.TagMapper;
import com.dongda.entity.Tag;
import com.dongda.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("tagService")
public class TagServiceImpl implements TagService{

    @Resource
    private TagMapper tagMapper;
    @Override
    public List<Tag> getTagByUserId(Tag tag) {
        return tagMapper.selectByPrimaryKey(tag);
    }

    @Override
    public int insertTag(Tag tag) {
        return tagMapper.insert(tag);
    }

    @Override
    public int updateTag(Tag tag) {
        return tagMapper.updateByPrimaryKeySelective(tag);
    }

}
