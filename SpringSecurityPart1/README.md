# modules
spring-restful-webservices

# Tech stack
springboot 2.5.0-M3 , java 11,swagger2, No database used

# example module urls

- http://localhost:8080/users GET BasicAuth , username and password
- http://localhost:8080/users POST BasicAuth , username and password
    {
	"name":"Monty",
	"birthDate":"2020-03-25T14:20:31.898+00:00"
	}
# swagger urls	
- http://localhost:8080/swagger-ui/ 
- http://localhost:8080/swagger-ui/index.html
- http://localhost:8080/v2/api-docs
# actuator urls
- http://localhost:8080/actuator
- http://localhost:8080/
- http://localhost:8080/actuator/metrics/jvm.memory.used

