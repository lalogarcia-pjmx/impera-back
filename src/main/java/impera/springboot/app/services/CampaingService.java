package impera.springboot.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import impera.springboot.app.models.Campaing;
import impera.springboot.app.repositories.campaings.CampaignRepository;


@Service
public class CampaingService {

    @Value("${config.propertie.file.example}")
    private String propiedadEjemplo;

    private CampaignRepository repository;

    public CampaingService(@Qualifier("campaingFoo") CampaignRepository repository) {
        this.repository = repository;
    }

    public List<Campaing> findAll() {
        return repository.findAll().stream().map(p -> {
            Campaing newCampaing = (Campaing) p.clone();
            newCampaing.setName(propiedadEjemplo + newCampaing.getName());
            return newCampaing;
        }).collect(Collectors.toList());
    }

    public Campaing findById(Long id) {
        return repository.findById(id);
    }
}
