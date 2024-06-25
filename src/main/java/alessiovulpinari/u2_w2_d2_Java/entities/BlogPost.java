package alessiovulpinari.u2_w2_d2_Java.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlogPost {

    private long id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int times;
}
