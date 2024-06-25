package alessiovulpinari.u2_w2_d2_Java.entities;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Author {

    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private String avatar;

    public Author(long id, String name, String surname, String email, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.setAvatar("https://ui-avatars.com/api/?name=" + this.getName() + this.getSurname());
    }
}
