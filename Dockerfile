# Utiliser une image de base avec JDK 17 (ou ta version Java)
FROM eclipse-temurin:17-jdk

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR généré dans le conteneur
COPY target/*.jar app.jar

# Exposer le port utilisé par ton application (ex : 8080)
EXPOSE 8080

# Lancer l'application
CMD ["java", "-jar", "app.jar"]
