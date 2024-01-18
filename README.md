# Restaurant Marketplace
## AnotaAi Backend Challenge

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)

This project is an API built using **Java, Java Spring, AWS Simple Queue Service, Mongo DB and AWS Simple Storage Service.**

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Contributing](#contributing)


## Installation

1. Clone the repository:

```bash
git clone https://github.com/setxpro/challenge-backend-anotaAI.git
```

2. Install dependencies with Maven

3. Create a configuration with your runtime environment variables with your AWS Credentials that are used in `application.properties`

```yaml
aws.region=us-east-1
aws.accessKeyId=${AWS_KEY_ID}
aws.secretKey=${AWS_SECRET}
```

**Config Values**

```yaml
AWS_KEY_ID=VALUE;AWS_SECRET=VALUE2
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8090

## API Endpoints
The API provides the following endpoints:

https://documenter.getpostman.com/view/27832983/2s9YsRd9gb

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.