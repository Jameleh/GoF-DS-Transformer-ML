package comp30910.service;

import comp30910.model.Reservation;
import comp30910.repository.ReservationRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Reservation makeReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
