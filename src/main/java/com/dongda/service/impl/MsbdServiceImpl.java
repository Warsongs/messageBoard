package com.dongda.service.impl;

import com.dongda.dao.MessBoardMapper;
import com.dongda.entity.MessBoard;
import com.dongda.service.MsbdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MsbdServiceImpl implements MsbdService{

    @Resource
    private MessBoardMapper messBoardMapper;

    @Override
    public List<MessBoard> getMebdList() {
        return messBoardMapper.queryAllMessBoard();
    }
}
