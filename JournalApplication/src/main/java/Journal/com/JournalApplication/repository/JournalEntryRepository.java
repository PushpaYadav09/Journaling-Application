package Journal.com.JournalApplication.repository;

import Journal.com.JournalApplication.model.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JournalEntryRepository extends JpaRepository<JournalEntry,Long> {
    List<JournalEntry> findByTitleContainingOrContentContaining(String title, String content);
}
