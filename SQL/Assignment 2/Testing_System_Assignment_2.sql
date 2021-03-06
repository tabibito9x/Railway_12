DROP DATABASE IF EXISTS Testing_System_Assignment_2;
CREATE DATABASE Testing_System_Assignment_2;

USE Testing_System_Assignment_2;

CREATE TABLE Department (
    DepartmentID 	MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY UNIQUE KEY,
    DepartmentName 	NVARCHAR(50) NOT NULL
);

CREATE TABLE `Position` (
	PositionID 		MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY UNIQUE KEY,
    PositionName 	ENUM("Dev","Test","Scrum Master", "PM") DEFAULT("Dev")
);

CREATE TABLE `Account` (
	AccountID 		MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY UNIQUE KEY,
    Email 			VARCHAR(100) NOT NULL,
    Username 		NVARCHAR(50) NOT NULL,
    FullName 		NVARCHAR(50) NOT NULL,
    DepartmentID 	MEDIUMINT UNSIGNED REFERENCES Department(DepartmentID),
    PositionID 		MEDIUMINT UNSIGNED REFERENCES `Position`(PositionID),
    CreateDate 		DATETIME
); 
   
CREATE TABLE `Group` (
	GroupID 		MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY UNIQUE KEY,
    GroupName 		VARCHAR(50) NOT NULL,
    CreatorID 		MEDIUMINT REFERENCES `Account`(AccountID),
    CreateDate 		DATETIME
);

CREATE TABLE GroupAccount(
	GroupID 		MEDIUMINT REFERENCES `Group`(GroupID),
    AccountID 		MEDIUMINT UNSIGNED REFERENCES `Account`(AccountID),
    JoinDate		DATETIME
);

CREATE TABLE TypeQuestion(
	TypeID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY UNIQUE KEY,
    TypeName 		ENUM("Essay", "Multiple-Choice")
);

CREATE TABLE CategoryQuestion (
	CategoryID 		MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName 	NVARCHAR(50)
);

CREATE TABLE Question(
	QuestionID 		MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 		NVARCHAR(250),
    CategoryID 		MEDIUMINT UNSIGNED REFERENCES CategoryQuestion(CategoryID),
    TypeID 			MEDIUMINT UNSIGNED REFERENCES TypeQuestion(TypeID),
    CreatorID 		MEDIUMINT UNSIGNED REFERENCES `Account`(AccountID),
    CreateDate 		DATETIME
);

CREATE TABLE Answer(
	AnswerID 		MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 		NVARCHAR(250),
    QuestionID 		MEDIUMINT UNSIGNED REFERENCES Question(QuestionID),
    isCorrect 		BIT
);

CREATE TABLE Exam(
	ExamID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code` 			CHAR(5) UNIQUE KEY,
    Title 			NVARCHAR(50),
    CategoryID 		MEDIUMINT UNSIGNED REFERENCES CategoryQuestion(CategoryID),
    Duration 		TINYINT,
    CreatorID 		MEDIUMINT UNSIGNED REFERENCES `Account`(AccountID),
    CreateDate 		DATETIME
);

CREATE TABLE ExamQuestion(
	ExamID 			MEDIUMINT UNSIGNED REFERENCES Exam(ExamID),
    QuestionID 		MEDIUMINT UNSIGNED REFERENCES Question.QuestionID
);