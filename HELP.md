# Getting Started

# How to run 

### ./mvnw spring-boot:run

# List video

* [Java 01: Introduce](https://www.youtube.com/watch?v=pNZyzE_9EPM)
* [Java 02: Install vs Start Project sử dụng vs CODE và intellij IDEA](https://www.youtube.com/watch?v=BpQsIGVrmXs&t=387s)
* [Java 03: Mức độ ưu tiên file Application và hiểu sâu về properties, yaml trong config dự án](https://www.youtube.com/watch?v=PvcIwEkUcEc)
* [Java 04: Kỹ năng chuyển đổi PROJECT từ DEV qua TEST, PRE, PRODUCT](https://www.youtube.com/watch?v=z49Kb4a_cV0)
* [Java 05: Làm quen với Spring Boot Folder Structure](https://www.youtube.com/watch?v=jnURsbcOycM)
* [JAVA 06: Spring Data JPA](https://www.youtube.com/watch?v=EwSrtrk7Kq0&t=17s)
* [JAVA 07: Làm quen với Controller và Spring Data JPA](https://www.youtube.com/watch?v=0unBab23Kok)
* [JAVA 08: Làm quen phân trang pageable với Spring Data JPA](https://www.youtube.com/watch?v=pDKVqwN4fLg)

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.3/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.3/reference/web/servlet.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.



