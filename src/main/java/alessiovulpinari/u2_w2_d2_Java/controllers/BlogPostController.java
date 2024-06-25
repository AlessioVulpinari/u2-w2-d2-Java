package alessiovulpinari.u2_w2_d2_Java.controllers;

import alessiovulpinari.u2_w2_d2_Java.entities.BlogPost;
import alessiovulpinari.u2_w2_d2_Java.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogpost")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public List<BlogPost> getAllBlogPosts() {
        return blogPostService.getAllBlogPosts();
    }

    @GetMapping("/{blogpostId}")
    public BlogPost getBlogPostById(@PathVariable long blogpostId)
    {
        return blogPostService.getBlogPostsById(blogpostId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPost createABlogPost(@RequestBody BlogPost blogPost) {
        return blogPostService.addBlogPostToList(blogPost);
    }

    @PutMapping("/{blogpostId}")
    public BlogPost updateABlogPost(@RequestBody BlogPost blogPost, @PathVariable long blogpostId) {
        return blogPostService.updateAnAuthor(blogpostId, blogPost);
    }

    @DeleteMapping("/{blogpostId}")
    public void deleteABlogPost(@PathVariable long blogpostId) {
        blogPostService.deleteABlogPost(blogpostId);
    }
}
