package com.example.demo.services.impl;

import com.example.demo.entities.Post;
import com.example.demo.repo.PostRepo;
import com.example.demo.services.interfaces.PostService;
import org.springframework.stereotype.Service;


@Service
public class PostServiceImpl implements PostService {


    private PostRepo postRepo;
    @Override
    public Post getPostById(long id) {
        Post post = postRepo.getById(id);

        if(post.getId() == 1){
            return null;
        }

        return post;
    }
}
