package com.example.S0525U5W2D2.Services;

import com.example.S0525U5W2D2.Entities.Author;
import com.example.S0525U5W2D2.Payloads.NewAuthorPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AuthorService {

    private List<Author> authorsDB = new ArrayList<>();

    public List<Author> findAll() {
        return this.authorsDB;
    }

    public Author saveAuthor(NewAuthorPayload payload) {
        Author newAuthor = new Author(payload.getName(), payload.getSurname(), payload.getEmail(), payload.getBirthDate());
        this.authorsDB.add(newAuthor);
        log.info("l'autore " + newAuthor.getId() + " è stato aggiunto");
        return newAuthor;
    }

    public Author findById(long authorId) {
        Author found = null;
        for (Author blog : authorsDB) {
            if (blog.getId() == authorId) {
                found = blog;
            }
            if (found == null) log.info("Autore non trovato!");
        }
        return found;
    }

    public Author findByIdAndUpdate(long authorId, NewAuthorPayload payload) {
        Author found = null;
        for (Author author : this.authorsDB) {
            if (author.getId() == authorId) {
                found = author;
                found.setName(payload.getName());
                found.setSurname(payload.getSurname());
                found.setEmail(payload.getEmail());
                found.setBirthDate(payload.getBirthDate());
                found.setAvatar(payload.getAvatar());
            }
        }
        if (found == null) log.info("Autore non trovato");
        return found;
    }

    public void findByIdAndDelete(long authorId) {
        Author found = null;
        for (Author author : this.authorsDB) {
            if (author.getId() == authorId) {
                found = author;
            }
            if (found == null) log.info("Autore non trovato");
        }
        this.authorsDB.remove(found);
    }
}
