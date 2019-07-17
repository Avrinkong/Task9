package jnshu.tiles.service.impl;

import jnshu.tiles.dao.CompanyMapper;
import jnshu.tiles.entity.Company;
import jnshu.tiles.entity.CompanyExample;
import jnshu.tiles.service.CompanyService;
import jnshu.tiles.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {


    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public Company selectById(Long id) {
        Company company1 =null;
        try {
            company1= redisUtil.get(id.toString(), Company.class);
        }catch (Exception e){
            System.out.println("2失去连接！");
        }
        if (null!=company1){
            System.out.println("company1"+company1);
            return company1;
        }else {
            Company company = companyMapper.selectByPrimaryKey(id);
            try {

                redisUtil.set(id.toString(),company);
                System.out.println("company"+company);
            }catch (Exception e){
                System.out.println("111失去连接！");
            }
            return company;
        }
    }

    @Override
    public List<Company> selectAll(CompanyExample companyExample) {
        List<Company> redisString = null;
        try {
            redisString = (List<Company>) redisUtil.get("companyList",Company.class);
        }catch (Exception e){
            System.out.println("2失去连接");
        }
        if (null!=redisString){
            return  redisString;
        }else {
            List<Company> companyList = companyMapper.selectByExample(companyExample);
            try {
                redisUtil.set("companyList",companyList);
            }catch (Exception e){
                System.out.println("22222失去连接");
            }
            return companyList;
        }
    }
}
