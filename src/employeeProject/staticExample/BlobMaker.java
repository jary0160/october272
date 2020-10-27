/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeProject.staticExample;

/**
 *
 * @author jary0160
 */
public class BlobMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blob a, b, c;
        System.out.println("c will tell me how many: " + c.getBlobCount());
        a = new Blob("Joey");
        b = new Blob("Frankie");
        c = new Blob("Moe");
        System.out.println("I have " + Blob.getBlobCount() + " blobs.");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
        
        System.out.println("c will tell me how many: " + c.getBlobCount());
    }
    
}
