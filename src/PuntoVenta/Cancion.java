/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoVenta;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jlme.util.Player;

/**
 *
 * @author erick
 */
public class Cancion extends Thread {

    public static Player player;

    public void run() {
        try {
            Numeros na = new Numeros(1, 14);
            for (int i = 0; i < 14; i++) {
                switch (na.generar()) {
                    case 1:
                        AnotherBrick();
                        break;
                    case 2:
                        Calendar();
                        break;
                    case 3:
                        ComfortablyNumb();
                        break;
                    case 4:
                        HeyYou();
                        break;
                    case 5:
                        HighHopes();
                        break;
                    case 6:
                        Labios();
                        break;
                    case 7:
                        Leni();
                        break;
                    case 8:
                        Paranoid();
                        break;
                    case 9:
                        Poli();
                        break;
                    case 10:
                        Shineon();
                        break;
                    case 11:
                        TheFinalCut();
                        break;
                    case 12:
                        TheGreat();
                        break;
                    case 13:
                        Veneno();
                        break;
                    case 14:
                        WishYou();
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void AnotherBrick() throws Exception {
        String nombreMP3 = "AnotherBrick.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Calendar() throws Exception {
        String nombreMP3 = "Calendar.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void ComfortablyNumb() throws Exception {
        String nombreMP3 = "ComfortablyNumb.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void HeyYou() throws Exception {
        String nombreMP3 = "HeyYou.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void HighHopes() throws Exception {
        String nombreMP3 = "HighHopes.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Labios() throws Exception {
        String nombreMP3 = "Labios.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Leni() throws Exception {
        String nombreMP3 = "Leni.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void Paranoid() throws Exception {
        String nombreMP3 = "Paranoid.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void Poli() throws Exception {
        String nombreMP3 = "Poli.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Shineon() throws Exception {
        String nombreMP3 = "Shineon.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void TheFinalCut() throws Exception {
        String nombreMP3 = "TheFinalCut.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void TheGreat() throws Exception {
        String nombreMP3 = "TheGreat.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Veneno() throws Exception {
        String nombreMP3 = "Veneno.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void WishYou() throws Exception {
        String nombreMP3 = "WishYou.mp3";
        String dir;
        dir = getPath(nombreMP3);
        System.out.println(dir);
        try {
            FileInputStream fis;
            fis = new FileInputStream(dir);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String getPath(String p) {
        String dir = "";
        char d = ((char) 92);
        for (int x = 0; x < p.length(); x++) {
            char l = p.charAt(x);
            if (d == l) {
                dir += "\\";
            } else {
                dir += l + "";
            }
        }
        return dir;
    }
}
