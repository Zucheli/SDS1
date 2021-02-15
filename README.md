# Big Game Survey
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Zucheli/sds1/blob/master/LICENSE) 

# Sobre o Projeto

- [Site](https://sds1-zucheli.netlify.app)
- [APK](https://github.com/Zucheli/sds1/blob/master/apk/Big_Game_Survey.apk)

Big Game Survey é uma aplicação full stack web e mobile construída durante a 1ª edição da **Semana DevSuperior** (#sds1), evento organizado pela [DevSuperior](https://devsuperior.com).

A aplicação consiste em uma pesquisa de preferência de games, onde os dados são coletados no app mobile, e depois são listados no app web, que também apresenta um dashboard com gráficos baseados nestes dados.

Big Game Survey is a full stack web and mobile application built during the 1st edition of **Semana DevSuperior** (# sds1), an event organized by [DevSuperior] (https://devsuperior.com).

The application consists of a game preference survey, where data is collected on the mobile app, and then is listed on the web app, which also features a dashboard with graphics based on this data. 

## Layout Mobile
![Mobile 1](https://github.com/Zucheli/sds1/blob/master/assets/mobile-tela-inicial.jpeg) ![Mobile 2](https://github.com/Zucheli/sds1/blob/master/assets/mobile-tela-registros.jpeg)

## Layout Web
![Web 1](https://github.com/Zucheli/sds1/blob/master/assets/web-tela-inicial.png)
![Web 2](https://github.com/Zucheli/sds1/blob/master/assets/web-tela-registros-v2.png)
![Web 3](https://github.com/Zucheli/sds1/blob/master/assets/web-tela-tabelas.png)

## Modelo Conceitual / Conceptual Model
![Conceitual](https://github.com/Zucheli/sds1/blob/master/assets/conceitual.png)

# Tecnologias utilizadas / Technologies used
## Back-End
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front-End
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## Implantação em produção / Deployment in production
- Back-End: Heroku
- Front-End Web: Netlify
- Banco de Dados: Postgresql

# Como executar o projeto / How to run the project

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/Zucheli/sds1.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/Zucheli/sds1.git

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
npm install

# executar o projeto
npm run start
```

# Autor / Author

Mateus Henrique Zucheli 

https://www.linkedin.com/in/mateus-zucheli-8b5b76171/
