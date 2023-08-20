package com.mycompany.group234.repository;


import com.mycompany.group234.model.TemplateScreen;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class TemplateScreenRepository extends SimpleJpaRepository<TemplateScreen, String> {
    private final EntityManager em;
    public TemplateScreenRepository(EntityManager em) {
        super(TemplateScreen.class, em);
        this.em = em;
    }
    @Override
    public List<TemplateScreen> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"TemplateScreen\"", TemplateScreen.class).getResultList();
    }
}