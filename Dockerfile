#OpenJDK 8 и установленный Maven
FROM maven:3.8.3-jdk-8 as builder
# Соберем и запустим приложение в этой директории
WORKDIR /app
# Копируем файл сборки pom.xml и исходный текст программы
COPY ./ ./
# Компиляция, сборка и упаковка приложения в архив JAR
RUN mvn package
# Используем JRE как базовый образ нашего контейнера
FROM openjdk:8-jre-slim
# Используем такую же рабочую директорию
WORKDIR /app
# Скопируем архив JAR из первой from*
COPY --from=builder /app/target/PlombService-0.0.1.jar .
# Запуск приложения на Java OpenJDK 8
CMD ["java", "-jar", "/app/PlombService-0.0.1.jar"]