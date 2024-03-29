package Batch159;

public class SQL {

    /*
    Database is a collection of related information
    Database can be stored in different ways.

    Advantages of Storing Data in Computer's Memory or Cloud
    1-Huge amount of data can be stored
    2-Easy to create, read, update, delete
    3-Easy to access
    4-Quick access
    5-Security


    In an application we have tree basic parts:
    1-UserInterface-->Application has is interaction with user. For example amazon website.
    When you open an application, it is the side which comes in front of you.
    headers, product photos are in this page.
    2-API
    3-Database: When I want to buy something, I should be able to send some request to database.
    do we have these shoes in our database? Check all sizes. Application interact always with database.

    Amazon has own database in cloud. As user you have limitation about data you can see. It is for security.

    User Interface  -------> Database
               API  -------> Database


    *****************************************************************************************************************************


    Database Validation Test:
    When we make registration with our name, email they will send to database, and store there.
    I can call all the data from database when I will use. It is called Database Validation Test.
    When I will get the data, database should work properly and give me data exactly I want.

    API helps the applications understand each other. For example if amazon created with java, and visa created with python
    they can communicate with each other with help of API. API is like a translator.
    Every single web application have API.

    We have to sure/need to check our database can communicate with user-interface, and by using the API's
    with other applications really god, it calls  Database Validation Test.

    When you are able to do the CRUD (create, read, update,delete) operations, it means your database works fine, and Database Validation Test is passed.

    End to end test:
    User interface (user-end) <----> API <----> Database (application-end)
    for example we have to check our database with using user interface and with using API. When I test my application from an end to another end it calls end2end testing.


    *****************************************************************************************************************************


    END to END Testing (E2E)

    1)If you send data to database by using UI
    a)Validate data from UI by using search functionality (Selenium)
    b)Validate data by using SQL codes (SQL + Selenium)
    c)Validate data by using API codes (API + Selenium)

    2)If you send data to database by using SQL codes
    a)Validate data from UI by using search functionality (Selenium)
    b)Validate data by using SQL codes (SQL + Selenium)
    c)Validate data by using API codes (API + Selenium)

    3)If you send data to database by using API codes
    a)Validate data from UI by using search functionality (Selenium)
    b)Validate data by using SQL codes (SQL + Selenium)
    c)Validate data by using API codes (API + Selenium)


    *****************************************************************************************************************************


    Database Management System (DBMS):
    DBMS is a special software program which enables its users
    1)To access database,
    2)To Create, Read, Update, Delete  (CRUD)
    3)To get reports from database
    4)To control access to the database (Security)
    5)To interact with other applications


   *****************************************************************************************************************************


    SQL : Structured Query Language. SQL is a language used for interacting with Relational Data Base Management Systems (RDBMS)
    it has tables like structure, our data store in databases. We have to have some structure to store this data.

    In SQL--> Field: Column name,   Row: Record

    By using SQL we can;
    1)Create and Manage databases
    2)Create and Design database tables
    3)Create, Read, Update and Delete data (CRUD)
    4)Perform administration tasks like security, user management etc.

    We can use SQL for all Relational Data Base Management Systems (RDBMS) (PostgreSQL, Oracle SQL, MySQL, Microsoft SQL)
    The concepts are same but implementation can be slightly different.



    Relational Databases (SQL Database) --->    SQL: Storing data in relational way.
    1)A relational database stores data in tables
    2)The relationship between each data point is clear and searching through those relationships is easy.
    3)The relationship between tables and field types is called a schema.
    4)Relational Databases are also called SQL Databases. (Structured Query Language)

    Big tables are slower. it means huge data. We create small tables, and create relation between our tables, and make it faster.




    A database can use SQL or noSQL. Both of them can not be use as the same time.

    Non-relational Databases (non-SQL Databases)
    A non-relational database does not use the tabular schema (tables) of rows and columns like in relational databases.

    in SQL database, you will user enters all detail for registration.

    In NoSQL databases, for example they use json format to store the data.
    if you dont want to get all information from user, for example just registration with username, it is no-SQL
    you can let the user by just enter name, it depends on your company policy.



    *****************************************************************************************************************************


    Primary Key
    Primary keys must contain UNIQUE values, and can not contain NULL values
    For data whose all attributes are same, we need primary key to differentiate between them.
    A table can hva only one primary key, and in the table, this primary key can consist of multiple columns.

    Note: Primary key can be anything, a number, String, character etc.
    Note: If you use real values (existing values) as a primary key like SSN, or email afdress, it is called "Natural Primary Key"
    If you use any values like 1,2,3... it is called "Surrogate Primary Key"
    Surrogate key values are just members.

    Primary key can consist of multiple columns. for example Job_id and recruiter can be in the same time primary keys
    Combination of two keys must be unique.



    *****************************************************************************************************************************


    Foreign Key
    A Foreign Key is a key used to create link between two tables
    A Foreign Key is  afield (or collection of columns) in one table that refers to the Primary Key in another table.
    A table can have multiple Foreign Keys.
    Foreign Key can have NULL values and repeated values.

    For example I have two tables:
    Child table:StudentID, Firstname, Lastname, CourseID  -----> primary key: StudentID, Foreign Key: CourseID
    Parent table:CourseID, courseName, courseCredit, courseFee  -----> primary key: CourseID

    The CourseID column in the "Parent Table" is the primary key.
    The CourseID column in the "Child Table" is a foreign key.



    *****************************************************************************************************************************


    SQL Composite Key ---> Multiple Field Usage for PK purposes.
    A composite key is a combination of two or more columns in a table that can be used to uniquely identify
    each row in the table when the columns are combined uniqueness is guaranteed, but when it
    taken individually it does not guarantee uniqueness.



    *****************************************************************************************************************************


    Difference between "UNIQUE KEY" and "PRIMARY KEY"

    Primary Key                                                 Unique Key
    Only one primary key is allowed to use in a table.          A table can have more than once unique key.
    Primary key does not accept NULL values.                    Unique key can accept multiple NULL values for column

    For example, email addresses can be Unique key, but some students have not email adress, they can be null. But it is unique key.



    Common features of "UNIQUE KEY" and "PRIMARY KEY"

    Primary Key                                                 Unique Key
    A Primary Key of one table can be referenced                Unique keys are also referenced by the foreign key of another table
    by the foreign key of another table.
    Primary key does not allow duplication                      Unique key also does not allow duplication except null



   *****************************************************************************************************************************

   IDE: Integrated Development Environment
   Java is a programming language. With java we can write our code in Intellij, VsCode, Eclipse. These are IDE.
   You develop your java code in these IDEs and you push your cods to github.


   *****************************************************************************************************************************


    SQL is the combination of 4 different languages.
    1)Data Control Language (DCL)
    DCL is used to control privileges in Database. To perform any operation in the database, such as for creating tables, sequences or views,
    a user needs privileges. DCL manages users and permissions. It controls database for authentication, authorization issues.  Who can see which data.

    2)Data Definition Language (DDL)
    DDL deals with descriptions of the database schema (tables, columns, rows) and is used to create and modify the structure
    of database objects

    3)Data Manipulation Language (DML) -->For Create, Update, Delete
    DML deals with the manipulation of data present in the database. For example insert, update, and delete data.
    We can manipulate data in out databases.

    4)Data Query Language (DQL) -->Read   (You will read existing database)
    DQL is used to query the database for information
    DQL is used to get information that is already stored in database. It used for reading the data from tables.


   *****************************************************************************************************************************


    String Data Types:
    1-char(size) (has less memory usage). SSN, ZipCode...   char(2) -->it means you can use max 2 characters
    2-varchar(size) --> if data comes from users it can be long. We can use varchar(50) for name, varchar(80) for adress

    Numeric Data Types
    number(precision,scale) --> number(5,2) -->5:The total number of the digits, 2:number of the digits  -->786,35
    number(4,2)-->19,78         number(4,2)-->7896,52 if the precision is exceeded, SQL will give error
    number(3,0) and number(3) is same  -->number(3,0)-->789     number(3)-->789


    Date Data Type       dd-MMM-yy like 09-Aug-21
    We can change the format by using "ALTER SESSION SET NLS_DATE_FORMAT="YYYY-MM-DD" --> 2020-04-13


    BLOP Data Types --> BLOB: Binary Large OBjects
    BLOP is good to store digitized information like images, audios, and videos.






    */
}
