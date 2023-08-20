package com.mycompany.group234.repository;


import com.mycompany.group234.model.UIComp;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class UICompRepository extends SimpleJpaRepository<UIComp, String> {
    private final EntityManager em;
    public UICompRepository(EntityManager em) {
        super(UIComp.class, em);
        this.em = em;
    }
    @Override
    public List<UIComp> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"UIComp\"", UIComp.class).getResultList();
    }
}