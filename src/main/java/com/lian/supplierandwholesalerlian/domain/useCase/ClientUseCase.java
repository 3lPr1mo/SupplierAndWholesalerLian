package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.IClientServicePort;
import com.lian.supplierandwholesalerlian.domain.model.Client;
import com.lian.supplierandwholesalerlian.domain.spi.IClientPersistencePort;

import java.util.List;

public class ClientUseCase implements IClientServicePort {

    private final IClientPersistencePort clientPersistencePort;

    public ClientUseCase(IClientPersistencePort clientPersistencePort) {
        this.clientPersistencePort = clientPersistencePort;
    }

    @Override
    public void saveClient(Client client) {
        clientPersistencePort.saveClient(client);
    }

    @Override
    public List<Client> getAllClient() {
        return clientPersistencePort.getAllClient();
    }

    @Override
    public Client getClient(Long clientId) {
        return clientPersistencePort.getClient(clientId);
    }

    @Override
    public void updateClient(Client client) {
        clientPersistencePort.updateClient(client);
    }

    @Override
    public void deleteClient(Long clientId) {
        clientPersistencePort.deleteClient(clientId);
    }
}
