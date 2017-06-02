package com.rebekahperkins.meme.data;

import com.rebekahperkins.meme.model.Meme;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MemeRepository {
    private static final List<Meme> ALL_MEMES = Arrays.asList(
            new Meme("android-explosion", 123, LocalDate.of(2015,2,13), "Chris Ramacciotti", false),
            new Meme("ben-and-mike", 789, LocalDate.of(2015,10,30), "Ben Jakuben", true),
            new Meme("book-dominos", 456, LocalDate.of(2015,9,15), "Craig Dennis", false),
            new Meme("compiler-bot", 123, LocalDate.of(2015,2,13), "Ada Lovelace", true),
            new Meme("cowboy-coder", 789, LocalDate.of(2015,2,13), "Grace Hopper", false),
            new Meme("infinite-andrew", 456, LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    public Meme findByName(String name){
        for (Meme meme : ALL_MEMES){
            if (meme.getName().equals(name)){
                return meme;
            }
        }
        return null;
    }

    public List<Meme> getAllMemes(){
        return ALL_MEMES;
    }

    public List<Meme> findByCategoryId(int id){
        List<Meme> memes = new ArrayList<>();
        for (Meme meme : ALL_MEMES){
            if (meme.getCategoryId() == id){
                memes.add(meme);
            }
        }
        return memes;
    }
}
