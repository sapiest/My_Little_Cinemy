package My_Little_Teamy.My_Little_Cinemy.repos;

import My_Little_Teamy.My_Little_Cinemy.domains.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<Ticket, Long> {
}
