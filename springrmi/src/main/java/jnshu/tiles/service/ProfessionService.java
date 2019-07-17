package jnshu.tiles.service;


import jnshu.tiles.entity.Profession;
import jnshu.tiles.entity.ProfessionExample;

import java.util.List;

public interface ProfessionService {

     List<Profession> select(ProfessionExample professionExample);

}
