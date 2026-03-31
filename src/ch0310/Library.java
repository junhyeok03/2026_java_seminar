package ch0310;

public class Library {
    // 필드
    Book[] books;
    int bookCount = 0; // 실제 담긴 책의 권 수

    // 생성자
    public Library(int i) {
        books = new Book[i];
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목:" + books[i].title + ", " + books[i].author);
        }
    }

    public class Book {
        // 필드 선언
        String title;
        String author;

        // 생성자
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}