package Journal.com.JournalApplication.controller;


import Journal.com.JournalApplication.model.JournalEntry;
import Journal.com.JournalApplication.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/journal")
    public class JournalEntryController {
        @Autowired
        private JournalEntryService service;

        @GetMapping
        public List<JournalEntry> getAllEntries() {
            return service.getAllEntries();
        }

        @PostMapping
        public JournalEntry addEntry(@RequestBody JournalEntry entry) {
            return service.saveEntry(entry);
        }

        // Other endpoints for update, delete, etc.
    }



