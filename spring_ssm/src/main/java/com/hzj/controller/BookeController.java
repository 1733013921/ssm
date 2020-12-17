package com.hzj.controller;

import com.hzj.service.BookeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/booke")
public class BookeController {
    @Resource(name = "bookeServiceImpl")
    private BookeService bookeService;

    public void setBookeService(BookeService bookeService) {
        this.bookeService = bookeService;
    }
    @RequestMapping("/allBooke")
    public ModelAndView index() {
        ModelAndView mod=new ModelAndView();
        mod.setViewName("allBooke");
        mod.addObject("bookesList",bookeService.showBooke());
        return mod;
    }
}
