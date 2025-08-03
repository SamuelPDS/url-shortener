package com.samuel.shortenet_url.model.DTO;

import java.time.LocalDateTime;
import java.util.Date;

public record UrlShortenedResponseDTO(String shortenedUrl, LocalDateTime expirationDate) {
}
