package org.example.mappers;



import org.example.dto.JobsDto;
import org.example.models.Jobs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JobMapper {

    JobMapper INSTANCE = Mappers.getMapper(JobMapper.class);


    //Get
    JobsDto toDeptDto(Jobs j);

    //Post
    Jobs toModel(JobsDto dto);
}
