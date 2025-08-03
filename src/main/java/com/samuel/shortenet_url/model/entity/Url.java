package com.samuel.shortenet_url.model.entity;

import com.samuel.shortenet_url.model.DTO.UrlDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "URL")
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String originalUrl;

    @Column
    private String shortenedUrl;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime expirationDate;

    @Column
    private int accessCount;

    public Url(UrlDTO dto) {
        this.originalUrl = dto.originalUrl();
        this.shortenedUrl = dto.shortenedUrl();
        this.createdAt = dto.createdAt() != null ? dto.createdAt() : LocalDateTime.now();
        this.expirationDate = dto.expirationDate() != null ? dto.expirationDate() : LocalDateTime.now().plusDays(30);
        this.accessCount = 0; // Initialize access count to zero
    }

}
