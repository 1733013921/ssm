package com.hzj.service.Impl;

import com.hzj.dao.BookeMapper;
import com.hzj.pojo.Bookes;
import com.hzj.service.BookeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookeServiceImpl implements BookeService {
    @Resource
    private BookeMapper bookeMapper;

    public BookeMapper getBookeMapper() {
        return bookeMapper;
    }

    public void setBookeMapper(BookeMapper bookeMapper) {
        this.bookeMapper = bookeMapper;
    }

    public int addBooke(Bookes booke) {
        return bookeMapper.addBooke(booke);
    }

    public int deleteBooke(int id) {
        return bookeMapper.deleteBooke(id);
    }

    public int updateBooke(Bookes booke) {
        return bookeMapper.updateBooke(booke);
    }

    public List<Bookes> showBooke() {
        return bookeMapper.showBooke();
    }

    public Bookes findBooke(int id) {
        return bookeMapper.findBooke(id);
    }
}
