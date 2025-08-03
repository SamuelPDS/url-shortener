package com.samuel.shortenet_url.service;

import com.samuel.shortenet_url.mapper.UrlMapper;
import com.samuel.shortenet_url.model.DTO.UrlDTO;
import com.samuel.shortenet_url.model.DTO.UrlShortenedResponseDTO;
import com.samuel.shortenet_url.model.entity.Url;
import com.samuel.shortenet_url.repository.UrlRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@AllArgsConstructor
public class UrlService {
    private final UrlRepository repository;

    private final UrlMapper urlMapper;

    private final String BASE_62_CARACTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final int SHORT_URL_LENGTH = 6;

    public UrlShortenedResponseDTO covertToShortUrl(UrlDTO dto) {
        String shortenedUrl = generateShortUrl(dto);
        Url url = persistUrl(dto);
        return new UrlShortenedResponseDTO(shortenedUrl, url.getExpirationDate());
    }

    private String generateShortUrl(UrlDTO url) {
        String originalUrl = url.originalUrl();
        StringBuilder shortUrl = new StringBuilder();

        if(Objects.nonNull(originalUrl) && !originalUrl.isEmpty()) {
            int urlHash = originalUrl.hashCode();

            for (int i = 0; i < SHORT_URL_LENGTH; i++) {
                shortUrl.append(BASE_62_CARACTERS.charAt(Math.abs(urlHash) % BASE_62_CARACTERS.length()));
                urlHash /= BASE_62_CARACTERS.length();
            }
            return shortUrl.toString();
        }
        return shortUrl.toString();
    }

    private Url persistUrl(UrlDTO dto) {
        Url url = new Url(dto);
        return saveUrl(url);
    }

    private Url saveUrl(Url url) {
        return repository.save(url);
    }

}
