package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.AkshayProduct;
import com.example.day6cw3.repository.AkshayProductRepo;

@Service
public class ProductService {
    public AkshayProductRepo productRepo;
    public ProductService(AkshayProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AkshayProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AkshayProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AkshayProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AkshayProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
