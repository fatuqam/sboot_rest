package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by hadib_000 on 2016-12-12.
 */
@Service
public class BooksService {

    @Autowired
    private ContactsRepo contactsRepo;

    @Transactional
    public List<Contact> getAll(){

        return contactsRepo.findAll();

    }
}
