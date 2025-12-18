package impera.springboot.app.use.cases;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import impera.springboot.app.models.Campaing;
import impera.springboot.app.repositories.campaings.CampaignRepository;


@Service
public class SaveCampaignUseCaseService {

    @Value("${config.propertie.file.example}")
    private String propiedadEjemplo;

    private CampaignRepository repository;

    public SaveCampaignUseCaseService(@Qualifier("campaingFoo") CampaignRepository repository) {
        this.repository = repository;
    }

    public Campaing saveCampaing(Campaing newCampaing) {
        repository.save(newCampaing);

        //Guardar en VPTools

        //Guardar en BD cliente
        
        //Guardar en BD interna

        //Enviar notificacion

        //Enviar correo

        return newCampaing;
    }
}
