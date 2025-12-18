package impera.springboot.app.repositories.campaings;

import java.util.List;

import impera.springboot.app.models.Campaing;

public interface CampaignRepository {
    List<Campaing> findAll();

    Campaing findById(Long id);

    Campaing save(Campaing newCampaing);
}
