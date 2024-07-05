package com.dgmf.setterdi;

import com.dgmf.service.Service;

public class ClientWithSetterDI {
    // The Client Class Contains a Service Member Variable
    private Service service;

    // The Dependency is Injected Through a Setter Method.
    /*
    By accepting dependencies through a setter method, rather
    than a constructor :
        - Clients can allow injectors to manipulate their
        dependencies at any time.
        - This offers flexibility, but makes it difficult to
        ensure that all dependencies are injected and valid before
        the client is used.
    */
    public void setService(Service service) {
        if (service == null) {
            throw new IllegalArgumentException("Service Must Not Be Null");
        }

        this.service = service;
    }
}
