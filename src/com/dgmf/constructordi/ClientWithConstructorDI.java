package com.dgmf.constructordi;

import com.dgmf.service.Service;

public class ClientWithConstructorDI {
    // The Client Class Contains a Service Member Variable
    private Service service;

    // Client Class Requests Its Dependencies Through Its Constructor.
    // Constructor Dependency Injection Ensures the Client is Always in
    // a Valid State, Since It Cannot be Instantiated Without Its
    // Necessary Dependencies.
    public ClientWithConstructorDI(Service service) {
        if (service == null) {
            throw new IllegalArgumentException("Service Must Not Be Null");
        }

        this.service = service;
    }
}
