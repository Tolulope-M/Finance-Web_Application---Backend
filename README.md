## Reward Your Teacher(API)
An API that serves data to a JavaScript front-end.

### Tools
* Spring Boot
* PostgreSQL
* Git
* Spring Data JPA
* JUnit/Mockito
* Docker
---

### Testing the API endpoints

### Retrieve all schools

* Endpoint: `http://localhost:9001/api/v1/search/schools?offset=0&pageSize=10`

### Payload

```
curl --location --request GET 'http://localhost:9001/api/v1/search/schools?offset=0&pageSize=10' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmb3J0dW5lbndhY2h1a3d1QGdtYWlsLmNvbSIsImV4cCI6MTY2NDY1NzcxMywiaWF0IjoxNjY0NjU1OTEzfQ.n-GSwjoD9mPKLXFEZ7-3mz2t7G1M5dN3NpVVbmZzHb3pjJotU42WnK8ZqFj17uQOcN4a_7uX0ZH4E43N1waa7Q' \
--data-raw ''
```

### Response

```json
{
  "message": "success",
  "status": true,
  "timeCreated": "2022-10-01T21:29:56.69358",
  "data": [
    {
      "schoolName": "Federal Government College Enugu"
    },
    {
      "schoolName": "GOF International College"
    },
    {
      "schoolName": "Homaj International Secondary School"
    },
    {
      "schoolName": "Emmanuel International College"
    },
    {
      "schoolName": "Brookstone Secondary School"
    },
    {
      "schoolName": "British International School Lagos"
    },
    {
      "schoolName": "Effective International College"
    },
    {
      "schoolName": "Pearlville School"
    },
    {
      "schoolName": "King's College Lagos"
    }
  ]
}
```

### Register a teacher

* Endpoint: `http://localhost:9001/api/v1/teacher/register`

### Payload

```
curl --location --request POST 'http://localhost:9001/api/v1/register/teacher' \
--form 'file=@"/Users/decagon/Downloads/coverPhoto2.jpeg"' \
--form 'registration="{
    \"name\":\"Fortunate\",
\"email\":\"fortunenwachukwu@gmail.com\",
    \"password\":\"1234\",
    \"school\" : \"Pearlville School\",
    \"yearsOfTeaching\":\"3\",
    \"subjectTaught\":\"English\",
    \"schoolType\":\"Primary\",
  \"phoneNumber\":\"07034999322\",
    \"position\":\"HeadTeacher\",
    \"status\":\"Active\",
    \"about\":\"I am a teacher\"
}";type=application/json'
```
### Response
```json
{
    "message": "Registered Successfully",
    "status": true,
    "timeCreated": "2022-10-01T21:14:00.437287",
    "data": {
        "name": "Kehinde",
        "email": "TiamiyuKehinde5@gmail.com",
        "id": 5
    }
}
```
---
### Email Verification

![This is email verification screenshot](src/main/resources/static/EmailVerification.jpg)

### Response on Verification

```json
{
  "message": "Email Verified Successfully",
  "status": true,
  "timeCreated": "2022-10-01T21:15:33.796355",
  "data": {
    "name": "Fortunate",
    "email": "fortunenwachukwu@gmail.com"
  }
}
```
---
### Login a teacher

* Endpoint: `http://localhost:9001/api/v1/teacher/login`

### Payload

```
curl --location --request POST 'http://localhost:9001/api/v1/login/teacher' \
--header 'Content-Type: application/json' \
--data-raw '{
     "email" : "TiamiyuKehinde5@gmail.com",
    "password" : "1234"
}'
```
### Response
```json
{
    "message": "Login Successful",
    "status": true,
    "timeCreated": "2022-10-01T21:25:14.129381",
    "data": {
        "token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmb3J0dW5lbndhY2h1a3d1QGdtYWlsLmNvbSIsImV4cCI6MTY2NDY1NzcxMywiaWF0IjoxNjY0NjU1OTEzfQ.n-GSwjoD9mPKLXFEZ7-3mz2t7G1M5dN3NpVVbmZzHb3pjJotU42WnK8ZqFj17uQOcN4a_7uX0ZH4E43N1waa7Q"
    }
}
```

### Get Teacher Wallet Balance

* Endpoint: `http://localhost:9001/api/v1/wallet/teacher/balance`

### Payload

```
curl --location --request GET 'http://localhost:9001/api/v1/wallet/teacher/balance' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmb3J0dW5lbndhY2h1a3d1QGdtYWlsLmNvbSIsImV4cCI6MTY2NDY1NzcxMywiaWF0IjoxNjY0NjU1OTEzfQ.n-GSwjoD9mPKLXFEZ7-3mz2t7G1M5dN3NpVVbmZzHb3pjJotU42WnK8ZqFj17uQOcN4a_7uX0ZH4E43N1waa7Q'
```

### Response

```json
{
  "message": "success",
  "status": true,
  "timeCreated": "2022-10-01T21:31:04.374066",
  "data": {
    "balance": 0.00
  }
}
```
### Send Reward to a teacher

* Endpoint: `http://localhost:9001/api/v1/student/sendReward`

### PayLoad

```
curl --location --request Post 'http://localhost:9001/api/v1/student/sendReward' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmb3J0dW5lbndhY2h1a3d1QGdtYWlsLmNvbSIsImV4cCI6MTY2NDY1NzcxMywiaWF0IjoxNjY0NjU1OTEzfQ.n-GSwjoD9mPKLXFEZ7-3mz2t7G1M5dN3NpVVbmZzHb3pjJotU42WnK8ZqFj17uQOcN4a_7uX0ZH4E43N1waa7Q'
```
```json
{
  "message": "success",
  "status": true,
  "timeCreated": "2022-10-01T21:31:04.374066",
  "data": {
    "message": "payment sent successfully"
  }
}
```