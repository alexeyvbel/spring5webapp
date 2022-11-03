package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain drive design","1212");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        Publisher publisher = new Publisher("asd", "asd", "asdad", "asdd");

        publisherRepository.save(publisher);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Jhionson");
        Book book2 = new Book("Title book2","1212");

        rod.getBooks().add(book2);
        book2.getAuthors().add(rod);
    }
}
