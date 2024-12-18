# Quiz Application

## Description
The Quiz Application is a Java-based project that provides an interactive platform for creating and managing quizzes. It uses Spring Boot for the backend, with JPA and Hibernate to manage database interactions. This application is designed to store quiz questions, options, and correct answers, offering a flexible way to manage quizzes for educational or entertainment purposes.

## Features
- Add quiz questions with multiple options.
- Store the correct answer for each question.
- Seamless integration with databases using JPA and Hibernate.
#### Fields:
1. `id` - Primary key, auto-generated.
2. `questionText` - The text of the quiz question.
3. `correctAnswer` - The correct answer for the question.
4. `options` - A list of options for the question stored in a separate table (`question_options`).

#### Annotations:
- `@Entity`: Marks this class as a JPA entity.
- `@Id`: Denotes the primary key field.
- `@GeneratedValue`: Automatically generates IDs using the specified strategy.
- `@ElementCollection` and `@CollectionTable`: Used for storing the list of options in a separate table.

Start the Application 

![Alt text](https://github.com/Shubhojit123/Quiz-App/blob/main/images/1.png?raw=true)


Select Quiz Options

![Alt text](https://github.com/Shubhojit123/Quiz-App/blob/main/images/2.png?raw=true)

Your Quiz Startd

![Alt text](https://github.com/Shubhojit123/Quiz-App/blob/main/images/3.png?raw=true)

Your Quiz Result

![Alt text](https://github.com/Shubhojit123/Quiz-App/blob/main/images/4.png?raw=true)



