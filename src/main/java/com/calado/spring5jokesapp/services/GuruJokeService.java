package com.calado.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * Author: joaqu
 * Date:   2021-02-28
 */
@Service
@Profile({"guru","default"})
public class GuruJokeService implements JokeService {

    // Best practice - use private final
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public GuruJokeService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
