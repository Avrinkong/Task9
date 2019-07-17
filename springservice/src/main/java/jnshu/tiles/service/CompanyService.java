package jnshu.tiles.service;


import jnshu.tiles.entity.Company;
import jnshu.tiles.entity.CompanyExample;

import java.util.List;


public interface CompanyService {
    Company selectById(Long id);

    List<Company> selectAll(CompanyExample companyExample);
}
