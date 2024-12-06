package Journal.com.JournalApplication.service;

import Journal.com.JournalApplication.model.JournalEntry;
import Journal.com.JournalApplication.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository repository;

    public List<JournalEntry> getAllEntries(){
        return repository.findAll();
    }
    public JournalEntry saveEntry(JournalEntry entry){
     entry.setCreatedAt(LocalDateTime.now());
     return repository.save(entry);
    }
}
