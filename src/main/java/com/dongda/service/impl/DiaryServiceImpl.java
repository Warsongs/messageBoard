package com.dongda.service.impl;

import com.dongda.dao.DiaryMapper;
import com.dongda.entity.Diary;
import com.dongda.entity.DiaryKey;
import com.dongda.service.DiaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiaryServiceImpl implements DiaryService{

    @Resource
    private DiaryMapper diaryMapper;

    @Override

    public List<Diary> getDiaryByUserId(Diary diary) {
        return diaryMapper.selectByPrimaryKey(diary);
    }

    @Override
    public List<Diary> getDiaryByDate(String date) {
        return diaryMapper.getDiaryByDate(date);
    }

    @Override
    public int insertDiary(Diary diary) {
        return diaryMapper.insert(diary);
    }
}
