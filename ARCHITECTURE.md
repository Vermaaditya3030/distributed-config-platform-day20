# Architecture

```text
                  Client
                    |
          +---------+---------+
          |                   |
          v                   v
   Order Service        Payment Service
      :8081                 :8082
          |                   |
          +---------+---------+
                    |
                    v
            Config Server :8888
                    |
                    v
        Centralized configuration
```

For production: put configuration in a private Git repository, secure the config server, use encryption/Vault/KMS for secrets, add service discovery, config versioning and audit logging.
