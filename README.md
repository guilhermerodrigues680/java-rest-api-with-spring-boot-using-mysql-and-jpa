# Rest API with Spring Boot using MySQL and JPA

https://medium.com/@johnathanfercher/mysql-docker-7ff6d50d6cf1

https://www.freecodecamp.org/news/how-to-build-a-rest-api-with-spring-boot-using-mysql-and-jpa-f931e348734b/

https://www.oracle.com/br/technical-resources/articles/dsl/crud-rest-sb2-hibernate.html

https://docs.oracle.com/cd/E17952_01/connector-j-8.0-en/connector-j-reference-jdbc-url-format.html

https://www.baeldung.com/spring-data-sorting

https://stackoverflow.com/questions/21113154/spring-boot-ddl-auto-generator

https://docs.spring.io/spring-boot/docs/1.1.0.M1/reference/html/howto-database-initialization.html

https://thorben-janssen.com/spring-data-jpa-query-annotation/

## Executando o projeto

Importe a coleção de requests na pasta `postman-collection` no Postman.

```sh
# Subindo container do banco mysql
docker-compose down --rmi all && docker-compose up

# Rodando aplicação Spring Boot (linux)
./mvnw spring-boot:run
```
