package org.example.mappers;



import org.example.dto.JobsDto;
import org.example.models.Jobs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {JobMapper.class}, imports = {java.util.UUID.class}, componentModel = "cdi")

public interface JobMapper {

    JobMapper INSTANCE = Mappers.getMapper(JobMapper.class);


    //Get
    JobsDto toDeptDto(Jobs j);

    //Post
    Jobs toModel(JobsDto dto);
}
