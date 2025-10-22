# ThAmCo Update Retrieval Microservice

> Originally developed as part of the Cloud Computing DevOps module in the Computer Science course.

This project is part of the ThAmCo Order subsystem.
It fulfils its job as a microservice for updating order data.

> Originally developed as part of the Cloud Computing DevOps module in the Computer Science programme.

# Controller:
## `/orders/update/fulfil/{order_id}` - Post
This post mapping path is to request an order be marked as fulfilled. Used by the fulfil service.

# Environment Variables:
## Database:
`DB_URL` for the url to the database.<br>
`DB_USERNAME` for the username to the database.<br>
`DB_PASSWORD` for the password of the database.<br>

`DB_SQL_INIT_MODE` sets the initialization mode for the SQL database in the Spring Boot application.<br>
`DB_ENABLE_H2_CONSOLE` determines if the H2 console should be enabled for the service. Fallback = `false`.<br>
`DB_HIBERNATE_DDL_AUTO` configures the Hibernate DDL (Data Definition Language) auto settings in the Spring Boot application.<br>


## Update Specific:
`RETRIEVAL_DOMAIN` The domain for the retrieval service.<br>
`RETRIEVAL_PATH` The path for the retrieval service.<br>

## Other:
### Testing:
NOTE: These are only used for testing purposes and should not be used in a production environment as they are not defined in the production `application.properties` file.<br>
`TEST_VAR` Used to test if the application is correctly reading environment variables. Should read as anything but "fallback" since fallback means failure. Fallback = `fallback`.<br>
`UPDAET_PORT` Used for testing on a local machine. Fallback = `59000`.<br>
Fallback means the default value should the environment variable not be set. If there is no mention of a fallback variable, there is no fallback value, and it could cause issues.
