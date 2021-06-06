## Blog Post

:scroll: See this [blog post](https://jvdevlab.com/blog/jee/properties-loading) for more details about this project.

## Description

This project shows how to create an uber jar using maven.


## Setup

- Install [Docker](https://docs.docker.com/get-docker/).
- Clone the repo.

## Demo

- To start the app run:

```bash
docker compose up app
```

- Confirm the resulting jar contains 3rd party dependencies

![](https://jvdevlab.com/img/maven-uber-jar/02.PNG)

## Cleanup

```bash
docker compose down
```