package com.samuel.shortenet_url.model.DTO;

import java.time.LocalDateTime;

public record UrlDTO(String shortenedUrl, String originalUrl, LocalDateTime createdAt, LocalDateTime expirationDate) {
}
