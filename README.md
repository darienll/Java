1. Чтобы скачать проект запускаем команду-  git clone https://github.com/daryn2/JavaHelloWorld.git
2. Заходим в папку: JavaHelloWorld
запускаем 
mvn package 
java -jar target/hello-world-project-0.0.1-SNAPSHOT.jar
3. Ждём когда запуститься сервер. После запуска сервера заходим в браузере по адресу:
http://localhost:8080/
4. И видим результат.
5. Заходим сюда src/main/java/resources/data.sql и меняем сообщение вот так 
INSERT INTO `test_table` VALUES (1,'Hello  world!');
6. Обновляем страницу (или наживаем такую то кнопку) и смотрим что сообщение обновилось.