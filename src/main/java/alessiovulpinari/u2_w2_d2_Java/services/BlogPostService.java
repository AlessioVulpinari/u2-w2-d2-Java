package alessiovulpinari.u2_w2_d2_Java.services;

import alessiovulpinari.u2_w2_d2_Java.entities.Author;
import alessiovulpinari.u2_w2_d2_Java.entities.BlogPost;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Service
public class BlogPostService {

    private final Faker faker = new Faker(Locale.ITALY);
    private final Random random = new Random();

    public List<BlogPost> blogPostList = new ArrayList<>();

    public List<BlogPost> getAllBlogPosts() {
        return this.blogPostList;
    }

    public BlogPost getBlogPostsById(Long blogPostId) {
        return this.blogPostList.stream().filter(blogPost -> blogPost.getId() == blogPostId).toList().getFirst();
    }

    public BlogPost addBlogPostToList(BlogPost blogPost) {
        this.blogPostList.add(blogPost);
        return blogPost;
    }

    public BlogPost updateAnAuthor(long blogPostId, BlogPost newBlogPost) {
        BlogPost blogPost = getBlogPostsById(blogPostId);

        blogPost.setCategory(newBlogPost.getCategory());
        blogPost.setCover(newBlogPost.getCover());
        blogPost.setTitle(newBlogPost.getTitle());
        blogPost.setTimes(newBlogPost.getTimes());
        blogPost.setContent(newBlogPost.getContent());

        return newBlogPost;
    }

    public void deleteABlogPost(long blogPostId) {
        this.blogPostList.remove(getBlogPostsById(blogPostId));
    }
}
