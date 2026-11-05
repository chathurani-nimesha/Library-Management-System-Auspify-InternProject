# Library Management System

A simple Java console-based application developed as **Task 03** of the Java Developer Internship at Auspify Technologies.

This system helps manage library books. Users can add, remove, search, issue, and return books.

## Features

- Add new books with automatically generated Book IDs.
- Remove books using Book ID.
- View available books.
- Search books by ID or title.
- Issue books.
- Return books.
- Check book availability.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner
- IntelliJ IDEA

## Book ID Format

Each book receives an automatically generated ID.

Examples:
- B0001
- B0002
- B0003

## Project Structure

```text
LibraryManagementSystem/
│
├── src/
│   ├── Book.java
│   └── LibraryManagement.java
│
└── README.md
```

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure a JDK is configured.
4. Open `LibraryManagement.java`.
5. Run the `main()` method.
6. Select an option from the menu.

## Main Menu



## Book Information

Each book contains:

- Book ID
- Book Title
- Author
- Availability Status

## Data Storage

Book records are stored using an `ArrayList`. The data is available while the application is running. Records are not permanently saved after closing the application.

## Internship Details

- **Organization:** Auspify Technologies
- **Program:** Java Developer Internship
- **Task:** Task 03 – Library Management System

---

Developed as part of my Java learning journey.