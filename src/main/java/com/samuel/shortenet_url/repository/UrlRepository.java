package com.samuel.shortenet_url.repository;

import com.samuel.shortenet_url.model.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {
    // This interface will automatically provide CRUD operations for the Url entity.
    // You can add custom query methods here if needed.
}
