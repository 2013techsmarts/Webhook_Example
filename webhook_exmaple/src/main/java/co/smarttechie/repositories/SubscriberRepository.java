package co.smarttechie.repositories;

import co.smarttechie.entities.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
    Optional<Subscriber> findByCallbackUrl(String callbackUrl);
}
