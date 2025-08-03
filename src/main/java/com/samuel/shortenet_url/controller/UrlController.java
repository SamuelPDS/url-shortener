package com.samuel.shortenet_url.controller;

import com.samuel.shortenet_url.model.DTO.UrlShortenedResponseDTO;
import com.samuel.shortenet_url.service.UrlService;
import com.samuel.shortenet_url.model.DTO.UrlDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RestController()
@RequestMapping("api/url")
public class UrlController {

    @Autowired
    private UrlService urlService;

//    @PostMapping
//    @Transactional
//    public ResponseEntity<DoctorDetailsDTO> createDoctor(@RequestBody @Valid DoctorDTO doctorDTO, UriComponentsBuilder uriBuilder) {
//        var doctor = repository.save(new Doctor(doctorDTO));
//        var uri = uriBuilder.path("/doctor/{id}").buildAndExpand(doctor.getId()).toUri();
//        return ResponseEntity.created(uri).body(new DoctorDetailsDTO(doctor));
//
//        //o status 201 precisa devolver o proprio codigo, o corpo e um cabeçalho location
//    }


    @PostMapping()
    public ResponseEntity<UrlShortenedResponseDTO> toShortUrl(@RequestBody UrlDTO dto) {
        try {

        } catch (Exception e) {
            log.error("Error converting URL to short URL: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.ok().body(urlService.covertToShortUrl(dto));
    }
}
