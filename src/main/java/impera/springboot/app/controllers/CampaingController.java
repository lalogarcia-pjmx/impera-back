package impera.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import impera.springboot.app.models.Campaing;
import impera.springboot.app.services.CampaingService;
import impera.springboot.app.use.cases.SaveCampaignUseCaseService;

@RestController
@RequestMapping("/api/campaing")
public class CampaingController {

    @Autowired
    private CampaingService serviceCampaing;

    @Autowired
    private SaveCampaignUseCaseService saveCampaignUseCase;

    @GetMapping
    public List<Campaing> list() {
        return serviceCampaing.findAll();
    }

    @GetMapping("/{id}")
    public Campaing show(@PathVariable Long id) {
        return serviceCampaing.findById(id);
    }

    @PostMapping
    public Campaing saveCampaing(@RequestBody Campaing newCampaing) {
        return this.saveCampaignUseCase.saveCampaing(newCampaing);
    }
}
