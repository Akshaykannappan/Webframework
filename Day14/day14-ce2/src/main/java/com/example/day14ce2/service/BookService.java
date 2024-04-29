package com.example.day14ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.model.AkshayBook;
import com.example.day14ce2.repository.AkshayBookRepo;

@Service
public class BookService {
   @Autowired
   AkshayBookRepo bookRepo;

   public AkshayBook addBook(AkshayBook book)
   {
        return bookRepo.save(book);
   }

   public List<AkshayBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<AkshayBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public AkshayBook updateBook(int id,AkshayBook book)
   {
        AkshayBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
