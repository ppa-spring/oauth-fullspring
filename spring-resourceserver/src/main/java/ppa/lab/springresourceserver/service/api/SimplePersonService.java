package ppa.lab.springresourceserver.service.api;

import ppa.lab.springresourceserver.exception.ServiceException;
import ppa.lab.springresourceserver.model.dto.SimplePersonDto;

import java.util.List;
import java.util.Optional;

public interface SimplePersonService {

    Optional<SimplePersonDto> getSimplePerson(Long id) throws ServiceException;

    SimplePersonDto getSimplePerson(String firstName, String lastName) throws ServiceException;

    List<SimplePersonDto> getSimplePersons(String firstName) throws ServiceException;
}