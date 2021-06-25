package one.digitalinnovation.beerstockdio.mapper;

import one.digitalinnovation.beerstockdio.dto.BeerDTO;
import one.digitalinnovation.beerstockdio.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
