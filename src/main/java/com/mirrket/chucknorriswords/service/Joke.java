package com.mirrket.chucknorriswords.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Joke {


    ChuckNorrisQuotes chuckNorrisQuotes;

    public Joke() {
       this.chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    public String joke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
