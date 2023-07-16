package Kodlama.io.Devs.DataAccess.Abstracts;

import Kodlama.io.Devs.Entities.Concretes.ProgrammingLanguage;

import java.util.List;

public interface IProgrammingLanguageRepository {
    void Add(ProgrammingLanguage programmingLanguage);
    void Delete(ProgrammingLanguage programmingLanguage);
    void Update(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> GetAll();
    ProgrammingLanguage GetById(int id);
}
