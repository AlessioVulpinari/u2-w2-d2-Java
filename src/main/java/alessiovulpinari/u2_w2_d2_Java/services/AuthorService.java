package alessiovulpinari.u2_w2_d2_Java.services;

import alessiovulpinari.u2_w2_d2_Java.entities.Author;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Service
public class AuthorService {

    private final Faker faker = new Faker(Locale.ITALY);
    private final Random random = new Random();

    public List<Author> authors = new ArrayList<>();

    public List<Author> getAllAuthors() {
        return this.authors;
    }

    public Author getAuthorById(Long authorId) {
        return this.authors.stream().filter(author -> author.getId() == authorId).toList().getFirst();
    }

    public Author addAuthorToList(Author newAuthor) {
        this.authors.add(newAuthor);
        return newAuthor;
    }

    public Author updateAnAuthor(long authorId, Author newAuthor) {
        Author author = getAuthorById(authorId);

        author.setAvatar(newAuthor.getAvatar());
        author.setEmail(newAuthor.getEmail());
        author.setName(newAuthor.getName());
        author.setSurname(newAuthor.getSurname());
        author.setDateOfBirth(newAuthor.getDateOfBirth());

        return newAuthor;
    }

    public void deleteAnAuthor(long authorId) {
        this.authors.remove(getAuthorById(authorId));
    }
}
