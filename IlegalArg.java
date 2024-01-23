/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author BLEZA
 */
public class IlegalArg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Contoh IllegalArgumentException
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Umur tidak boleh negatif");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException terjadi: " + e.getMessage());
        }
    }
}