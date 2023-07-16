package Kodlama.io.Devs.Business.Abstracts;

import Kodlama.io.Devs.Entities.Concretes.ProgrammingLanguage;

import java.util.List;

public interface IProgrammingLanguageService {
    void Add(ProgrammingLanguage programmingLanguage);
    void Delete(ProgrammingLanguage programmingLanguage);
    void Update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage GetById(int id);
    List<ProgrammingLanguage> GetAll();
}
