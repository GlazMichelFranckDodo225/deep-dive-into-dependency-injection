package com.dgmf.withoutdependencyinjection;

// The Client Class Contains a Service Member Variable
// Initialized in Its Constructor.
public class Client {
    private Service service;

    public Client() {
        System.out.println("Client Instantiation ...");

        // The Client Directly Constructs and Controls which
        // Service it Uses, Creating a Hard-Coded Dependency
        this.service = new Service();
    }
}
