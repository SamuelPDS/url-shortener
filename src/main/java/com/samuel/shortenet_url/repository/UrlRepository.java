package com.samuel.shortenet_url.repository;

import com.samuel.shortenet_url.model.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url, Long> {
    Optional<Url> findByOriginalUrl(String s);
    // This interface will automatically provide CRUD operations for the Url entity.
    // You can add custom query methods here if needed.
}
