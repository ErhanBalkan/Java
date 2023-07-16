package Kodlama.io.Devs.Business.Concretes;

import Kodlama.io.Devs.Business.Abstracts.IProgrammingLanguageService;
import Kodlama.io.Devs.DataAccess.Abstracts.IProgrammingLanguageRepository;
import Kodlama.io.Devs.Entities.Concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements IProgrammingLanguageService {
    private final IProgrammingLanguageRepository _programmingLanguageRepository;

    public ProgrammingLanguageManager(IProgrammingLanguageRepository programmingLanguageRepository) {
        _programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void Add(ProgrammingLanguage programmingLanguage) {
        _programmingLanguageRepository.Add(programmingLanguage);
    }

    @Override
    public void Delete(ProgrammingLanguage programmingLanguage) {
        _programmingLanguageRepository.Delete(programmingLanguage);
    }

    @Override
    public void Update(ProgrammingLanguage programmingLanguage) {
        _programmingLanguageRepository.Update(programmingLanguage);
    }

    @Override
    public ProgrammingLanguage GetById(int id) {
        return _programmingLanguageRepository.GetById(id);
    }

    @Override
    public List<ProgrammingLanguage> GetAll() {
        return _programmingLanguageRepository.GetAll();
    }
}
