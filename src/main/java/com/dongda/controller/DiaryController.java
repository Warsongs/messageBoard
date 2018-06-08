package com.dongda.controller;

import com.dongda.entity.Diary;
import com.dongda.entity.DiaryKey;
import com.dongda.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("diaryController")
@RequestMapping("/diary")
public class DiaryController {
    @Autowired
    private DiaryService diaryService;
    @RequestMapping(value="/list", method = RequestMethod.POST)
    @ResponseBody
    public List<Diary> list(@RequestBody Diary diary){
        List<Diary> diaryList = diaryService.getDiaryByUserId(diary);
        return diaryList;
    }

    @RequestMapping(value="/listByDate", method = RequestMethod.GET)
    @ResponseBody
    public List<Diary> list(@RequestParam String date){
        List<Diary> diaryList = diaryService.getDiaryByDate(date);
        return diaryList;
    }


    @RequestMapping(value="add",method=RequestMethod.POST)
    @ResponseBody
    public int add(@RequestBody Diary diary){
        int i = diaryService.insertDiary(diary);
        if(i>0){
            return 1;
        }
        else
            return -1;
    }
}
