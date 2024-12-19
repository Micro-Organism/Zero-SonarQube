# Zero-SonarQube-Boot

## start
```
docker-compose up -d
```
SonarQube： http://localhost:9000

## login information
username：admin
password：admin
## 停止服务：如果你想停止服务，可以运行以下命令：
```
docker-compose down
```

https://github.com/jeremylong/DependencyCheck?tab=readme-ov-file

## docker-compose.yml
```yaml
version: '3.7'

services:
  postgres:
    image: postgres:13
    restart: always
    environment:
      POSTGRES_USER: sonar
      POSTGRES_PASSWORD: sonar
      POSTGRES_DB: sonar
    volumes:
      - postgres_data:/var/lib/postgresql/data

  sonarqube:
    image: sonarqube:9.9-community
    restart: always
    ports:
      - "9000:9000"
    environment:
      SONAR_JDBC_URL: jdbc:postgresql://postgres:5432/sonar
      SONAR_JDBC_USERNAME: sonar
      SONAR_JDBC_PASSWORD: sonar
    depends_on:
      - postgres
    volumes:
      - sonarqube_data:/opt/sonarqube/data
      - sonarqube_extensions:/opt/sonarqube/extensions
      - sonarqube_bundled-plugins:/opt/sonarqube/bundled-plugins

volumes:
  postgres_data:
  sonarqube_data:
  sonarqube_extensions:
  sonarqube_bundled-plugins:
```