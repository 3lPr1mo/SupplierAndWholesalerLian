package com.lian.supplierandwholesalerlian.domain.spi;

import com.lian.supplierandwholesalerlian.domain.model.Client;

import java.util.List;

public interface IClientPersistencePort {
    void saveClient(Client client);

    List<Client> getAllClient();

    Client getClient(Long clientId);

    void updateClient(Client client);

    void deleteClient(Long clientId);
}
