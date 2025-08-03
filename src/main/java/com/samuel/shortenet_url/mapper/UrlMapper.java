package com.samuel.shortenet_url.mapper;

import com.samuel.shortenet_url.model.DTO.UrlDTO;
import com.samuel.shortenet_url.model.entity.Url;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UrlMapper {
    Url toEntity(UrlDTO urlDTO);
}
