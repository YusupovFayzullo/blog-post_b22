package uz.jl.blogpost.backend.mappers;

import lombok.NonNull;
import uz.jl.blogpost.backend.domains.Entity;
import uz.jl.blogpost.backend.dtos.Dto;

import java.util.List;

public interface BaseMapper<T extends Entity, D extends Dto, CD extends Dto, UD extends Dto> extends Mapper{
    T fromCreateDTO(@NonNull CD dto);

    T fromUpdateDTO(@NonNull CD dto);

    D toDTO(@NonNull T domain);

    List<D> toDTO(@NonNull List<T> domain);

}
