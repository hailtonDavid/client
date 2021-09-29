package org.analiseevolutiva.client.respositories;

import org.analiseevolutiva.client.entities.Client;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepositoryImplementation<Client, Long> {

}
