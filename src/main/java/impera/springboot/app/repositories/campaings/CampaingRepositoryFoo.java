package impera.springboot.app.repositories.campaings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import impera.springboot.app.models.Campaing;

@Repository("campaingFoo")
public class CampaingRepositoryFoo implements CampaignRepository {

    private List<Campaing> data;

    public CampaingRepositoryFoo() {
        this.data = new ArrayList<>();
        this.data.add(new Campaing(1L, "Tarjeta de credito"));
        this.data.add(new Campaing(2L, "Ventas del buen fin"));
    }

    @Override
    public List<Campaing> findAll() {
        return data;
    }

    @Override
    public Campaing findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Campaing save(Campaing newCampaing) {
        System.out.println("El nombre es: " + newCampaing.getName());
        data.add(newCampaing);

        return newCampaing;
    }
}
