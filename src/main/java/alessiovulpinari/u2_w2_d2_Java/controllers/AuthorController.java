package alessiovulpinari.u2_w2_d2_Java.controllers;

import alessiovulpinari.u2_w2_d2_Java.entities.Author;
import alessiovulpinari.u2_w2_d2_Java.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
       return authorService.getAllAuthors();
    }

    @GetMapping("/{authorId}")
    public Author getAuthorById(@PathVariable long authorId) {
        return authorService.getAuthorById(authorId);
    }

    @PostMapping
    public Author createAnAuthor(@RequestBody Author author) {
        return authorService.addAuthorToList(author);
    }

    @PutMapping("/{authorId}")
    public Author updateAnAuthor(@RequestBody Author newAuthor, @PathVariable long authorId) {
        return authorService.updateAnAuthor(authorId, newAuthor);
    }

    @DeleteMapping("/{authorId}")
    public void deleteAnAuthor(@PathVariable long authorId) {
        authorService.deleteAnAuthor(authorId);
    }

}
