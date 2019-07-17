package jnshu.tiles.service.impl;

import jnshu.tiles.dao.ProfessionMapper;
import jnshu.tiles.entity.Profession;
import jnshu.tiles.entity.ProfessionExample;
import jnshu.tiles.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("professionService")
public class ProfessionServiceImpl implements ProfessionService {

    @Autowired
    private ProfessionMapper professionMapper;

    @Override
   /* @Cacheable(value = "aboutProfession")*/
    public List<Profession> select(ProfessionExample professionExample) {
        return professionMapper.selectByExample(professionExample);
    }
}
