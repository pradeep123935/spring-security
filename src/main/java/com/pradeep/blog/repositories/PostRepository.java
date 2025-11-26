package com.pradeep.blog.repositories;

import com.pradeep.blog.domain.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
}
