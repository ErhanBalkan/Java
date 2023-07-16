package Kodlama.io.Devs.DataAccess.Concretes;

import Kodlama.io.Devs.DataAccess.Abstracts.IProgrammingLanguageRepository;
import Kodlama.io.Devs.Entities.Concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements IProgrammingLanguageRepository {
    private List<ProgrammingLanguage> _programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        _programmingLanguages = new ArrayList<ProgrammingLanguage>();
        _programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
        _programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
        _programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
    }

    @Override
    public void Add(ProgrammingLanguage programmingLanguage) {
        _programmingLanguages.add(programmingLanguage);
        System.out.println("Eklendi.");
    }

    @Override
    public void Delete(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage programmingLanguageToDelete;
        for(ProgrammingLanguage pr : _programmingLanguages){
            if (pr.getId() == programmingLanguage.getId()){
                programmingLanguageToDelete = pr;
                _programmingLanguages.remove(programmingLanguage);
                System.out.println("Silindi.");
            }else{
                System.out.println("Silinecek öğe bulunamadı.");
            }
        }

    }

    @Override
    public void Update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage programmingLanguageToUpdate;
        for (ProgrammingLanguage pr : _programmingLanguages){
            if(pr.getId() == programmingLanguage.getId()){
                programmingLanguageToUpdate = programmingLanguage;
                programmingLanguageToUpdate.setName(programmingLanguage.getName());
                System.out.println("Güncellendi.");
            }else{
                System.out.println("Güncellenecek öğe bulunamadı.");
            }
        }
    }

    @Override
    public List<ProgrammingLanguage> GetAll() {
        return _programmingLanguages;
    }

    @Override
    public ProgrammingLanguage GetById(int id) {
        ProgrammingLanguage programmingLanguage;
        for (ProgrammingLanguage pr : _programmingLanguages){
            if(pr.getId() == id){
                return pr;
            }
        }
        return null;
    }
}
