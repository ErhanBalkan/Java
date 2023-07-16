package Kodlama.io.Devs.WebAPI.Controllers;

import Kodlama.io.Devs.Business.Abstracts.IProgrammingLanguageService;
import Kodlama.io.Devs.Entities.Concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesRepository {
    private final IProgrammingLanguageService _programmingLanguageService;

    public ProgrammingLanguagesRepository(IProgrammingLanguageService programmingLanguageService) {
        _programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/get-all")
    public List<ProgrammingLanguage> GetAll(){
        return  _programmingLanguageService.GetAll();
    }
}
