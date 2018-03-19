package br.com.rca.votos.domain.cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {
  private CargoRepository cargoRepository;

  @Autowired
  public CargoService(CargoRepository cargoRepository) {
    this.cargoRepository = cargoRepository;

    cargoRepository.deleteAll();
    cargoRepository.save(new Cargo("Presidente"));
  }
}
