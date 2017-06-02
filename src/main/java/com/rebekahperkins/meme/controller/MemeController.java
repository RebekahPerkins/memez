package com.rebekahperkins.meme.controller;

import com.rebekahperkins.meme.data.MemeRepository;
import com.rebekahperkins.meme.model.Meme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class MemeController {

    @Autowired
    private MemeRepository memeRepository;

    @RequestMapping("/")
    public String listMemes(ModelMap modelMap){
        List<Meme> memes = memeRepository.getAllMemes();
        modelMap.put("memes", memes);
        return "home";
    }

    @RequestMapping("/meme/{name}")
    public String memeDetails(@PathVariable String name, ModelMap modelMap){
        Meme meme = memeRepository.findByName(name);
        modelMap.put("meme",meme);
        return "meme-details";
    }
}
