# lotr-wiki
#### Проект создан для записи, хранения, редактирования и чтения информации о персонажах LOTR ("The Lord Of The Ring").

Коллекция Postman и техническое задание находятся в корневой папке проекта в файлах **LOTRWiki.postman_collection.json** и **TЗ.md** соответственно.

### В проекте используются зависимости:
- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- PostgreSQL JDBC Driver
- Project Lombok 

### Для запуска приложения необходимо наличие JVM и PostgreSQL. Перед запуском необходимо создать базу данных PostgreSQL со следующими параметрами:  
>port: 5432  
>database name: lotr  
>username: admin  
>password: admin  

При необходимости параметры БД можно изменить в файле src/main/resources/application.yaml

### Далее следует скачать проект и запустить метод main в классе:
>src/main/java/by/charniuk/lotr_wiki/LOTRWikiApplication.java  

Приложение после запуска создаёт две таблицы, которые удаляются после остановки работы приложения.