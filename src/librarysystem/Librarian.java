/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 * @author user
 */
public class Librarian {
    
    private int Librarian_Id;
    private String Librarian_Name;
    private String Librarian_Email;
    private String Librarian_Pass;
    private String Contact;
    
    //Empty Constructor

    public Librarian() {
      
    }
    
    
    // para Constructor

    public Librarian(int Librarian_Id, String Librarian_Name, String Librarian_Email, String Librarian_Pass, String Contact) {
        this.Librarian_Id = Librarian_Id;
        this.Librarian_Name = Librarian_Name;
        this.Librarian_Email = Librarian_Email;
        this.Librarian_Pass = Librarian_Pass;
        this.Contact = Contact;
    }

    public int getLibrarian_Id() {
        return Librarian_Id;
    }

    public void setLibrarian_Id(int Librarian_Id) {
        this.Librarian_Id = Librarian_Id;
    }

    public String getLibrarian_Name() {
        return Librarian_Name;
    }

    public void setLibrarian_Name(String Librarian_Name) {
        this.Librarian_Name = Librarian_Name;
    }

    public String getLibrarian_Email() {
        return Librarian_Email;
    }

    public void setLibrarian_Email(String Librarian_Email) {
        this.Librarian_Email = Librarian_Email;
    }

    public String getLibrarian_Pass() {
        return Librarian_Pass;
    }

    public void setLibrarian_Pass(String Librarian_Pass) {
        this.Librarian_Pass = Librarian_Pass;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }
    
    
    
    
}
