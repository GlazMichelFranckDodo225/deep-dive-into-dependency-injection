package com.dgmf.withoutdi;

import com.dgmf.service.Service;

public class ClientWithoutDI {
    // The Client Class Contains a Service Member Variable
    // Initialized in Its Constructor by Itself.
    private Service service;

    public ClientWithoutDI() {
        System.out.println("Client Instantiation ...");

        // The Client Directly Constructs and Controls which
        // Service it Uses, Creating a Hard-Coded Dependency
        this.service = new Service();
    }
}
