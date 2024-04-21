package com.udea.edu.co.busquedadevuelos.backendvirtual.services;

import com.udea.edu.co.busquedadevuelos.backendvirtual.controllers.dto.CreateFlightDto;
import com.udea.edu.co.busquedadevuelos.backendvirtual.entities.VueloData;
import java.util.List;
import java.util.Optional;


public interface VuelosService {

    List<VueloData> getAllFlights(Long page, Long size);

    Optional<VueloData> getFlightById(Long id);

    List<VueloData> listarVuelosIdaVuelta(
            Long page,
            Long size
    );
    void createFlight(CreateFlightDto createFlightDto);
}
