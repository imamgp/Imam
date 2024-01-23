/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author BLEZA
 */
public class NullPointer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Contoh NullPointerException
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException terjadi: " + e.getMessage());
        }
    }
}