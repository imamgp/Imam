/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author BLEZA
 */

    public class ArithmeticException {

    public static void main(String[] args) {
        try {
            // Contoh ArithmeticException
            int result = 5 / 0;
        } catch (Exception e) {
            System.out.println("ArithmeticException terjadi: " + e.getMessage());
        }
    }
    }