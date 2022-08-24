public class Library {

    public static void main(String[] args) {

        // Creation of Book Objects
        Book Book01 = new Book("Lord of The Rings - The Two Towers", "J.R.R. Tolkien", "jrrtolkien@gmail.com", 'M', 10.65, 5);
        Book Book02 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", "jkrowling@gmail.com", 'F', 4.65, 3);
        Book Book03 = new Book("1984", "George Orwell", "georgeorwell@hotmail.com", 'M', 8.43, 1);
        Book Book04 = new Book("AI SuperPowers", "Kai-Fu Lee", "kflee@gmail.com", 'M', 9.32, 7);

        // Outputs
        System.out.println("Book Name: " + Book01.getBookName() + "\nAuthor Name: " + Book01.getName() + "\nAuthor Email: " + Book01.getEmail() +
                "\nAuthor Gender: " + Book01.getGender() + "\nPrice: £" + Book01.getPrice() + "\nQuantity: " + Book01.getQty());
        System.out.println("\nBook Name: " + Book02.getBookName() + "\nAuthor Name: " + Book02.getName() + "\nAuthor Email: " + Book02.getEmail() +
                "\nAuthor Gender: " + Book02.getGender() + "\nPrice: £" + Book02.getPrice() + "\nQuantity: " + Book02.getQty());
        System.out.println("\nBook Name: " + Book03.getBookName() + "\nAuthor Name: " + Book03.getName() + "\nAuthor Email: " + Book03.getEmail() +
                "\nAuthor Gender: " + Book03.getGender() + "\nPrice: £" + Book03.getPrice() + "\nQuantity: " + Book03.getQty());
        System.out.println("\nBook Name: " + Book04.getBookName() + "\nAuthor Name: " + Book04.getName() + "\nAuthor Email: " + Book04.getEmail() +
                "\nAuthor Gender: " + Book04.getGender() + "\nPrice: £" + Book04.getPrice() + "\nQuantity: " + Book04.getQty());
    }
}
