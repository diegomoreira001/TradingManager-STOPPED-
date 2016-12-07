package com.dmoreira.fintech.services;

import com.dmoreira.fintech.domains.Bond;
import com.dmoreira.fintech.domains.Stock;
import com.dmoreira.fintech.repositories.rest.MervalRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by diego.moreira on 11/7/2016.
 */
@Component
public class BondQuotesService {

    @Autowired
    private MervalRestRepository mervalRestRepository;

    public List<Bond> listTopBondQuotes() {
        return mervalRestRepository.getTopBondQuotes();
    }

    public MervalRestRepository getMervalRestRepository() {
        return mervalRestRepository;
    }

    public void setMervalRestRepository(MervalRestRepository mervalRestRepository) {
        this.mervalRestRepository = mervalRestRepository;
    }
}
