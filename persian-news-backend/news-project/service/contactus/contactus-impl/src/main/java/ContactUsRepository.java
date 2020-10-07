import com.beyki.service.common.repository.MiddleRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsRepository extends MiddleRepository, ContactUsCustomRepository{
}
