package andrei.starter.repos;

import org.springframework.data.repository.CrudRepository;

import andrei.starter.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
