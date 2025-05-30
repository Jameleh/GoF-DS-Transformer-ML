package comp30910.service;

import com.jsoniter.JsonIterator;
import com.jsoniter.spi.TypeLiteral;
import comp30910.exception.ResourceNotFoundException;
import comp30910.model.Movie;
import comp30910.repository.MovieRepository;
import comp30910.util.FileIO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    @Value("${data_file}")
    private String dataFile;

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie findByNameAndShowTime(String name, String showTime) {
        String errorMessage =
                String.format("Movie not found with name = %s, show time = %s", name, showTime);
        return movieRepository
                .findByNameAndShowTime(name, showTime)
                .orElseThrow(() -> new ResourceNotFoundException(errorMessage));
    }

    public void initDatabase() {
        List<Movie> movies = new ArrayList<>();
        try {
            String jsonString = FileIO.readFileAsString(dataFile);
            TypeLiteral<List<Movie>> type = new TypeLiteral<>() {};
            movies = JsonIterator.deserialize(jsonString, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        movieRepository.deleteAll();
        movieRepository.saveAll(movies);
    }
}
