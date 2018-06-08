package com.dongda.controller;

import com.dongda.entity.Tag;
import com.dongda.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tag")
public class TagController {
    @Autowired
    private TagService tagService;
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public List<Tag> list(@RequestBody Tag tag){
        List<Tag> tagList = tagService.getTagByUserId(tag);
        return tagList;
    }

    @RequestMapping(value="add",method=RequestMethod.POST)
    @ResponseBody
    public int add(@RequestBody Tag tag){
        int i = tagService.insertTag(tag);
        if(i>0){
            return 1;
        }
        else
            return -1;
    }

    @RequestMapping(value="update",method=RequestMethod.POST)
    @ResponseBody
    public int update(@RequestBody Tag tag){
        int i = tagService.updateTag(tag);
        if(i>0){
            return 1;
        }
        else
            return -1;
    }
}
