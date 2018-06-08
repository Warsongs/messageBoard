package com.dongda.service;

import com.dongda.entity.Tag;

import java.util.List;

public interface TagService {
    List<Tag> getTagByUserId(Tag tag);
    int insertTag(Tag tag);
    int updateTag(Tag tag);
}
