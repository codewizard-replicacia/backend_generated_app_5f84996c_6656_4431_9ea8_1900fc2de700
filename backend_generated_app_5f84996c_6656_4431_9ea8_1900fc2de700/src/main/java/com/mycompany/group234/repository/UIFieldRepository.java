package com.mycompany.group234.repository;


import com.mycompany.group234.model.UIField;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class UIFieldRepository extends SimpleJpaRepository<UIField, String> {
    private final EntityManager em;
    public UIFieldRepository(EntityManager em) {
        super(UIField.class, em);
        this.em = em;
    }
    @Override
    public List<UIField> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"UIField\"", UIField.class).getResultList();
    }
}