package app.bootstrap;

import app.model.Owner;
import app.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import app.services.OwnerService;
import app.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("M");
        owner1.setLastName("D");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("MD");
        owner2.setLastName("DD");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        System.out.println(ownerService.findAll().size());

        Vet vet1 = new Vet();
        vet1.setFirstName("D");
        vet1.setLastName("D");

        vetService.save(vet1);

        System.out.println("Loaded Vets...");
    }
}
