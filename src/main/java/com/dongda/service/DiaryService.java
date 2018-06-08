package com.dongda.service;

import com.dongda.entity.Diary;
import com.dongda.entity.DiaryKey;

import java.util.List;

public interface DiaryService {
    List<Diary> getDiaryByUserId(Diary diary);
    List<Diary> getDiaryByDate(String date);
    int insertDiary(Diary diary);
}
